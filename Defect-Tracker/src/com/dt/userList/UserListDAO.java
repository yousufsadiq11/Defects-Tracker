/**
 * 
 */
package com.dt.userList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dt.model.User;
import com.dt.utility.DBUtility;
import com.dt.utility.SQLConstants;

/**
 * @author Abhishek
 *
 */
public class UserListDAO implements IUserListDAO {

	/**
	 * 
	 */
	public UserListDAO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<User> getUserList() {
		
		//TODO have to test the getConnection function
		ArrayList<User> listOfUsers = new ArrayList<User>();
		Connection con= DBUtility.getConnection();
		try {
			PreparedStatement stmt = con.prepareStatement(SQLConstants.GET_USER_LIST);
			ResultSet resultSet = stmt.executeQuery();
			while(resultSet.next()){
				User user = new User();
				user.setUserName(resultSet.getString("user_name"));
				user.setEmail(resultSet.getString("email"));
				user.setRole(resultSet.getString("role"));
				user.setModule(resultSet.getString("module"));
				listOfUsers.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listOfUsers;
	}

	
	
}
