package com.dt.addUser;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.dt.model.User;
import com.dt.utility.*;

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
		PreparedStatement pst1 = conn.prepareStatement(SQLConstants.INSERT_USER);
		pst.setString(1, dao.getEmail());
		pst.setString(2, dao.getPassword());
		pst1.setString(1, dao.getEmail());
		x = pst.executeUpdate();
		if(x>0){
		pst1.executeUpdate();
		}
		DBUtility.closeConnection(conn);

		}
		catch(Exception e){
		e.printStackTrace();
		}
		return x;
	}
	
	
}
