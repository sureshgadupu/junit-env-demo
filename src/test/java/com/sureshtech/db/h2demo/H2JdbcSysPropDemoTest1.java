package com.sureshtech.db.h2demo;

import java.sql.Connection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import uk.org.webcompere.systemstubs.jupiter.SystemStub;
import uk.org.webcompere.systemstubs.jupiter.SystemStubsExtension;
import uk.org.webcompere.systemstubs.properties.SystemProperties;

/**
 * Unit test for simple App.
 */
@ExtendWith(SystemStubsExtension.class)
public class H2JdbcSysPropDemoTest1
   
{
	@SystemStub
	private static SystemProperties testVariables = new SystemProperties("DB_URL", "jdbc:h2:~/test","USER", "sa", "PASS","");
	
	H2JdbcSysPropDemo h2JdbcSysPropDemo;
	
	@BeforeEach
	public void setUp() {
		h2JdbcSysPropDemo = new H2JdbcSysPropDemo();
	}
	
	@Test
	public void testGetDbConnection() {
		Connection connection = h2JdbcSysPropDemo.getDbConnection(); 
		Assertions.assertNotNull(connection);
		
	}	
	
   
}
