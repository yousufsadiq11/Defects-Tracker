/**
 * 
 */
package com.dt.manageUser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dt.model.User;
import com.dt.utility.DBUtility;
import com.dt.utility.SQLConstants;

/**
 * @author Abhishek
 *
 */
public class ManageUserDAO implements IManageUserDAO {

	@Override
	public int updateUserDetails(User user) {
		int numRows = 0;
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement stmt = con.prepareStatement(SQLConstants.UPDATE_USER_DETAILS);
			
			stmt.setString(1,user.getUserName());
			stmt.setString(2,user.getEmail());
			stmt.setString(3, user.getRole());
			stmt.setString(4,user.getModule());
			stmt.setInt(5,user.getUserId());
			numRows = stmt.executeUpdate();
			System.out.println("numRows=="+numRows);
			DBUtility.closeConnection(con);
		} catch (SQLException e) {
			System.err.println("ERROR : \nSQL Error Code : " + e.getErrorCode() + " SQL State : " + e.getSQLState());
		}
		return numRows;
	}

	@Override
	public int deleteUser(User user) {
		int numRows = 0;
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement stmt = con.prepareStatement(SQLConstants.REMOVE_USER);
			stmt.setInt(1,user.getUserId());
			numRows = stmt.executeUpdate();
			System.out.println("numRows=="+numRows);
			DBUtility.closeConnection(con);
		} catch (SQLException e) {
			System.err.println("ERROR : \nSQL Error Code : " + e.getErrorCode() + " SQL State : " + e.getSQLState());
		}
		return numRows;
	}

}
