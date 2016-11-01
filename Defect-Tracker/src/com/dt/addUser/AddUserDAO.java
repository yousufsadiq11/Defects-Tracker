package com.dt.addUser;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.dt.model.User;
import com.dt.utility.DBUtility;
import com.dt.utility.SQLConstants;

/**
 * @author Anurag
 *
 */
public class AddUserDAO {
	public int addUser(User dao) {
		// TODO Auto-generated method stub
		int x=0;
		Connection conn=DBUtility.getConnection();
		try{
			
		PreparedStatement pst = conn.prepareStatement(SQLConstants.ADD_USER);
		pst.setString(1, dao.getEmail());
		
		x = pst.executeUpdate();
		DBUtility.closeConnection(conn);

		}
		catch(Exception e){
		e.printStackTrace();
		}
		return x;
	}
	
	
}
