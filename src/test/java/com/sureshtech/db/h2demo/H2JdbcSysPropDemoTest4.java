package com.sureshtech.db.h2demo;

import java.sql.Connection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import uk.org.webcompere.systemstubs.environment.EnvironmentVariables;
import uk.org.webcompere.systemstubs.jupiter.SystemStub;
import uk.org.webcompere.systemstubs.jupiter.SystemStubsExtension;
import uk.org.webcompere.systemstubs.properties.SystemProperties;
import uk.org.webcompere.systemstubs.resource.PropertySource;

/**
 * Unit test for simple App.
 */
@ExtendWith(SystemStubsExtension.class)
public class H2JdbcSysPropDemoTest4
   
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
	
	@Test
	public void testReadFromResourceGetDbConnection() throws Exception {

		new SystemProperties().set(PropertySource.fromResource("testsys.properties")).execute(() -> {
			Connection connection = h2JdbcSysPropDemo.getDbConnection();
			Assertions.assertNotNull(connection);

		});

	}
	
	 @Test 
	 public void testReadFromFileGetDbConnection() throws Exception {
	  
	  
		  new SystemProperties().set(PropertySource.fromFile("src\\test\\java\\resources\\testsys.properties")) .execute(() -> { 
			  Connection connection = h2JdbcSysPropDemo.getDbConnection();
			  Assertions.assertNotNull(connection);
		  
		  });
	  
	  
	  
	}
	
   
}
