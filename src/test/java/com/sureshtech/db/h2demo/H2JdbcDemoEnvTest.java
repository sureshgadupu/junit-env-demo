package com.sureshtech.db.h2demo;

import java.sql.Connection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import uk.org.webcompere.systemstubs.environment.EnvironmentVariables;
import uk.org.webcompere.systemstubs.jupiter.SystemStub;
import uk.org.webcompere.systemstubs.jupiter.SystemStubsExtension;

/**
 * Unit test for simple App.
 */
@ExtendWith(SystemStubsExtension.class)
public class H2JdbcDemoEnvTest
   
{
	@SystemStub
	private static EnvironmentVariables testVariables = new EnvironmentVariables("DB_URL", "jdbc:h2:~/test","USER", "sa", "PASS","");
	
	H2JdbcEnvDemo h2JdbcEnvDemo;
	
	@BeforeEach
	public void setUp() {
		h2JdbcEnvDemo = new H2JdbcEnvDemo();
	}
	
	@Test
	public void testGetDbConnection() {
		Connection connection = h2JdbcEnvDemo.getDbConnection(); 
		Assertions.assertNotNull(connection);
		
	}	
	
   
}
