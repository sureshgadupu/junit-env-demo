package com.sureshtech.db.h2demo;

import java.sql.Connection;
import java.sql.DriverManager;


public class H2JdbcSysPropDemo  
{
    
	public Connection getDbConnection() {
		 Connection conn = null;
		try{
	         // STEP 1: Register JDBC driver 
	         Class.forName("org.h2.Driver"); 
	         
	         conn = DriverManager.getConnection(System.getProperty("DB_URL"),System.getProperty("USER"),System.getProperty("PASS")); 
		} catch(Exception e) {
			System.out.println("Exception while connecting to DB : "+e);
			throw  new RuntimeException(e);
		}
		
		return conn;
	}
}
