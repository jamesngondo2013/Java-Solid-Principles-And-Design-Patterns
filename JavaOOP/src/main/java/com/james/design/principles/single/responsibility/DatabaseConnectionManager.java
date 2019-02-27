package com.james.design.principles.single.responsibility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnectionManager {

	private static DatabaseConnectionManager connectionManager = new DatabaseConnectionManager();
	private Connection conn;
	
	public static DatabaseConnectionManager getConnectionManagerInstance() {
		return connectionManager;
	}

	public Connection getConn() {
		return conn;
	}

	public void connect() {
		 try {
	            conn = (Connection)DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/automation", "root", "chingotah1980");
	            
	            if (conn!=null) {
	                System.out.println("successfully connected to database...");
	            }
	         
	        }catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	            System.out.println("cannot connect to database...");
	        }
	}

	public void disconnectDB() throws SQLException{
		conn.close();
		System.out.println("Disconnected from database...");
	}
}
