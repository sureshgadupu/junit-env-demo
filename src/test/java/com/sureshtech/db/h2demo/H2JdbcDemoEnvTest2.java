package com.sureshtech.db.h2demo;

import java.sql.Connection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.SetEnvironmentVariable;

/**
 * Unit test for simple App.
 */

public class H2JdbcDemoEnvTest2
   
{
	
	H2JdbcEnvDemo h2JdbcEnvDemo;
	
	@BeforeEach
	public void setUp() {
		h2JdbcEnvDemo = new H2JdbcEnvDemo();
	}
	
	@Test
	@SetEnvironmentVariable(key = "DB_URL",value = "jdbc:h2:~/test")
	@SetEnvironmentVariable(key = "USER",value = "sa")
	@SetEnvironmentVariable(key = "PASS",value = "")
	public void testGetDbConnection() {
		Connection connection = h2JdbcEnvDemo.getDbConnection(); 
		Assertions.assertNotNull(connection);
		
	}
   
}
