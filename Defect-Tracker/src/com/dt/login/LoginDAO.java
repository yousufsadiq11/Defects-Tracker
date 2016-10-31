package com.dt.login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dt.model.User;
import com.dt.utility.DBUtility;
import com.dt.utility.SQLConstants;

public class LoginDAO implements ILoginDAO
{
	@Override
	public Boolean login(User bean)
	{
		
		PreparedStatement stmt = null;
		String username = bean.getEmail();
		String password = bean.getPassword();
		System.out.println("username = "+username+"==password = "+password);
		try
		{
			Connection currentCon= DBUtility.getConnection();
			stmt=currentCon.prepareStatement(SQLConstants.CHECK_LOGIN);
			stmt.setString(1, username);
			stmt.setString(2, password);
			ResultSet rs=stmt.executeQuery();
			if(rs.next()){
				return true;
			}
			DBUtility.closeConnection(currentCon);
		} catch (SQLException e) {
			System.err.println("ERROR : \nSQL Error Code : "+e.getErrorCode()+" SQL State : "+e.getSQLState());
		}
		
		return false;
	}

}
