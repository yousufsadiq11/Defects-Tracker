package com.dt.login;
import java.text.*;
import java.util.*;

import com.dt.model.User;

import java.sql.*;

public class LoginDAO 
{
	static Connection currentCon=null;
	static ResultSet rs= null;
	public static User login(User bean)
	{
		Statement stmt = null;
		String username = bean.getUserName();
		String password = bean.getPassword();
		String searchQuery = "select * from User where username="+username+"AND password="+password+"";
		try
		{
			currentCon= Connection.getConnection();
			stmt=currentCon.createStatement();
			rs=stmt.executeQuery(searchQuery);
			boolean more=rs.next();
			if(!more)
			{
				System.out.println("Sorry you are not a registered User. Please signup first.");
				bean.setValid(false);
			}
			else if(more)
			{
				bean.setValid(true);
			}
		}
		catch (Exception ex)
		{
			System.out.println("Login Failed! An exception has occured: "+ex);
		}
		finally
		{
			  if (rs != null)	{
		            try {
		               rs.close();
		            } catch (Exception e) {}
		               rs = null;
		            }
			
		         if (stmt != null) {
		            try {
		               stmt.close();
		            } catch (Exception e) {}
		               stmt = null;
		            }
			
		         if (currentCon != null) {
		            try {
		               currentCon.close();
		            } catch (Exception e) {
		            }

		            currentCon = null;
		         }

		}
		return bean;
		
	}

}
