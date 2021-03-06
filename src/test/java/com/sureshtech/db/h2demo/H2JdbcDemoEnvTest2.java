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

public class H2JdbcDemoEnvTest2

{

	H2JdbcEnvDemo h2JdbcEnvDemo;
	EnvironmentVariables env = new EnvironmentVariables(PropertySource.fromResource("testenv.properties"));

	@BeforeEach
	public void setUp() {
		h2JdbcEnvDemo = new H2JdbcEnvDemo();		
	}

	@Test
	public void testGetDbConnection() throws Exception {

		env.execute(() -> {
			Connection connection = h2JdbcEnvDemo.getDbConnection();
			Assertions.assertNotNull(connection);
		});

	}	
	 

}
