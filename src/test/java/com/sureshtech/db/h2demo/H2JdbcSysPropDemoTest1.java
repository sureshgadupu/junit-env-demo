package com.sureshtech.db.h2demo;

import java.sql.Connection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.SetSystemProperty;

public class H2JdbcSysPropDemoTest1 {
	
	private H2JdbcSysPropDemo h2JdbcSysPropDemo;
	
	@BeforeEach
	public void setUp() {
		h2JdbcSysPropDemo = new H2JdbcSysPropDemo();
	}
	
	@Test
	@SetSystemProperty(key = "DB_URL", value = "jdbc:h2:~/test")
	@SetSystemProperty(key = "USER", value = "sa")
	@SetSystemProperty(key = "PASS", value = "")
	public void testGetDbConnection() {
		Connection connection = h2JdbcSysPropDemo.getDbConnection(); 
		Assertions.assertNotNull(connection);
		
	}

}
