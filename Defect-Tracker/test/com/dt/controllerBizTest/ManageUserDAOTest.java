package com.dt.manageUser;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;

import com.dt.utility.DBUtility;
import com.dt.utility.SQLConstants;

public class ManageUserDAOTest {

	@Test
	public void test() {
		int numRows = 0;
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement stmt = con.prepareStatement(SQLConstants.UPDATE_USER_DETAILS);
			
			stmt.setString(1,"anurag team_lead");
			stmt.setString(2,"atayade2@uncc.edu");
			stmt.setString(3,"2");
			stmt.setString(4,"1");
			stmt.setInt(5,2);
			numRows = stmt.executeUpdate();
			DBUtility.closeConnection(con);
		} catch (SQLException e) {
			System.err.println("ERROR : \nSQL Error Code : " + e.getErrorCode() + " SQL State : " + e.getSQLState());
		}
		assertEquals(1,numRows);
	}

	
	public void deleteUser() {
		int numRows = 0;
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement stmt = con.prepareStatement(SQLConstants.REMOVE_USER);
			stmt.setInt(1,3);
			numRows = stmt.executeUpdate();
			DBUtility.closeConnection(con);
		} catch (SQLException e) {
			System.err.println("ERROR : \nSQL Error Code : " + e.getErrorCode() + " SQL State : " + e.getSQLState());
		}
		assertEquals(1,numRows);
	}

	public void updatePassword() {
		int numRows = 0;
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement stmt = con.prepareStatement(SQLConstants.UPDATE_USER_PASSWORD);
			
			stmt.setString(1,"abcde");
			stmt.setString(2,"atayade2@uncc.edu");
			numRows = stmt.executeUpdate();
			DBUtility.closeConnection(con);
		} catch (SQLException e) {
			System.err.println("ERROR : \nSQL Error Code : " + e.getErrorCode() + " SQL State : " + e.getSQLState());
		}
		assertEquals(1,numRows);
		}

}
