package com.sureshtech.db.h2demo;

import java.sql.Connection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uk.org.webcompere.systemstubs.environment.EnvironmentVariables;
import uk.org.webcompere.systemstubs.resource.PropertySource;

/**
 * Unit test for simple App.
 */

public class H2JdbcDemoEnvTest1

{

	H2JdbcEnvDemo h2JdbcEnvDemo;
	EnvironmentVariables env = new EnvironmentVariables();

	@BeforeEach
	public void setUp() {
		h2JdbcEnvDemo = new H2JdbcEnvDemo();
		env.set("DB_URL", "jdbc:h2:~/test");
		env.set("USER", "sa");
		env.set("PASS", "");
	}

	@Test
	public void testGetDbConnection() throws Exception {

		env.execute(() -> {
			Connection connection = h2JdbcEnvDemo.getDbConnection();
			Assertions.assertNotNull(connection);
		});

	}

	@Test
	public void testReadFromResourceGetDbConnection() throws Exception {
		
		new EnvironmentVariables().set(PropertySource.fromResource("testenv.properties")).execute(() -> {
			Connection connection = h2JdbcEnvDemo.getDbConnection();
			Assertions.assertNotNull(connection);

		});

	}

	
	  @Test 
	  public void testReadFromFileGetDbConnection() throws Exception {	  
	  
		  new EnvironmentVariables().set(PropertySource.fromFile("src\\test\\java\\resources\\testenv.properties")) .execute(() -> { 
			  Connection connection = h2JdbcEnvDemo.getDbConnection();
			  Assertions.assertNotNull(connection);
		  
		  });
	  
	  
	  
	}
	 

}
