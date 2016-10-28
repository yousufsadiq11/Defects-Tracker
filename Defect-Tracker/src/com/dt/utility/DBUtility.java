/**
 * 
 */
package com.dt.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Abhishek
 *
 */
public class DBUtility {

	/**
	 * 
	 */
	public DBUtility() {
		// TODO Auto-generated constructor stub
	}

	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/defect_tracker", "root",
					"password");
			return con;
		} catch (Exception e) {
			System.err.println("ERROR : Cannot create a connection");
		}
		return null;
	}  
	
	
	public static void closeConnection(Connection con){
		try {
			con.close();
		} catch (SQLException e) {
			System.err.println("ERROR : Cannot close the connection.");
		}
	}
}
