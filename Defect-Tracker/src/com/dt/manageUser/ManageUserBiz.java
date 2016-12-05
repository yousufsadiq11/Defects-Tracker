/**
 * 
 */
package com.dt.manageUser;

import com.dt.model.User;
import com.dt.utility.SQLConstants;
import com.google.gson.Gson;

/**
 * @author Abhishek
 *
 */
public class ManageUserBiz implements IManageUserBiz {

	@Override
	public String updateUserDetails(String user) {
		
		User obj = new User();
		Gson gson = new Gson(); 
		obj = gson.fromJson(user,User.class);
		IManageUserDAO manageUserDAO = new ManageUserDAO();
		if(manageUserDAO.updateUserDetails(obj)!=0){
			return SQLConstants.MESSAGE_USER_DETAILS_SUCCESS;
		}else{
			return SQLConstants.MESSAGE_USER_DETAILS_FAILURE;
		}
	}

	@Override
	public String removeUser(String user) {
		
		User obj = new User();
		Gson gson = new Gson(); 
		obj = gson.fromJson(user,User.class);
		IManageUserDAO manageUserDAO = new ManageUserDAO();
		
		if(manageUserDAO.deleteUser(obj)!=0){
			return SQLConstants.MESSAGE_REMOVE_USER_SUCCESS;
		}else{
			return SQLConstants.MESSAGE_REMOVE_USER_FAILURE;
		}
	}

	@Override
	public String updatePassword(String user) {
		User obj = new User();
		Gson gson = new Gson(); 
		obj = gson.fromJson(user,User.class);
		IManageUserDAO manageUserDAO = new ManageUserDAO();
		if(manageUserDAO.updatePassword(obj)!=0){
			return SQLConstants.MESSAGE_PASSWORD_SUCCESS;
		}else{
			return SQLConstants.MESSAGE_PASSWORD_FAILURE;
		}
	}
	
	

}
