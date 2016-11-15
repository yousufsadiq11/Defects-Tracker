package com.dt.login;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.dt.utility.DBUtility;
import com.dt.utility.SQLConstants;

public class LoginDAOTest {

	@Test
	public void test() {
		int flag=0;
		PreparedStatement stmt = null;
		String username ="atayade2@uncc.edu";
		String password ="abcd";
		try
		{
			Connection currentCon= DBUtility.getConnection();
			stmt=currentCon.prepareStatement(SQLConstants.CHECK_LOGIN);
			stmt.setString(1, username);
			stmt.setString(2, password);
			ResultSet rs=stmt.executeQuery();
			if(rs.next()){
				 flag=1;
			}
			DBUtility.closeConnection(currentCon);
		} catch (SQLException e) {
			System.err.println("ERROR : \nSQL Error Code : "+e.getErrorCode()+" SQL State : "+e.getSQLState());
		}
		assertEquals(0,flag);
	}

}
