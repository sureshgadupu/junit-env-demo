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
public class H2JdbcDemoEnvTest3

{
	
	H2JdbcEnvDemo h2JdbcEnvDemo;
	
	@BeforeEach
	public void setUp() {
		h2JdbcEnvDemo = new H2JdbcEnvDemo();
	}
	
	
	
	@Test
	public void testGetDbConnection2() throws Exception {
		
		EnvironmentVariables env = new EnvironmentVariables();
		env.set("DB_URL", "jdbc:h2:~/test");
		env.set("USER", "sa");
		env.set("PASS", "");
		env.execute(() -> {
			Connection connection = h2JdbcEnvDemo.getDbConnection();
			Assertions.assertNotNull(connection);
		});
		
		
	}
   
}

