package com.sureshtech.db.h2demo;

import java.sql.Connection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.org.webcompere.systemstubs.properties.SystemProperties;


public class H2JdbcSysPropDemoTest2 {
	
	private H2JdbcSysPropDemo h2JdbcSysPropDemo;
	
	@BeforeEach
	public void setUp() {
		h2JdbcSysPropDemo = new H2JdbcSysPropDemo();
	}	
	
	
	@Test	
	public void testGetDbConnection() throws Exception {
		SystemProperties someProperties = new SystemProperties(
			    "DB_URL", "jdbc:h2:~/test",
			    "USER", "sa",
			    "PASS","");
		someProperties.execute(() -> {
		   
			Connection connection = h2JdbcSysPropDemo.getDbConnection(); 
			Assertions.assertNotNull(connection);
		});
		
		
	}

}
