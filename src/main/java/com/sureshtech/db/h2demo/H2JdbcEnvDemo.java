package com.sureshtech.db.h2demo;

import java.sql.Connection;
import java.sql.DriverManager;


public class H2JdbcEnvDemo  
{
    
	public Connection getDbConnection() {
		 Connection conn = null;
		try{
	         // STEP 1: Register JDBC driver 
	         Class.forName("org.h2.Driver"); 
	         
	         conn = DriverManager.getConnection(System.getenv("DB_URL"),System.getenv("USER"),System.getenv("PASS")); 
		} catch(Exception e) {
			System.out.println("Exception while connecting to DB"+e);
			throw  new RuntimeException(e);
		}
		
		return conn;
	}
}
