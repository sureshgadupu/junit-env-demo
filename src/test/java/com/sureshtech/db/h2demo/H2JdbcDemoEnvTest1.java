package com.sureshtech.db.h2demo;

import java.sql.Connection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uk.org.webcompere.systemstubs.environment.EnvironmentVariables;

/**
 * Unit test for simple App.
 */
//@ExtendWith(SystemStubsExtension.class)
public class H2JdbcDemoEnvTest1
   
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
			    		}
			    );
		
		
		
	}
   
}
