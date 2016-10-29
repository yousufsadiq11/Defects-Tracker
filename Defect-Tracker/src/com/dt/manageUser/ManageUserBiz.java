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
			System.out.println(" Update success");
			return SQLConstants.MESSAGE_USER_DETAILS_SUCCESS;
		}else{
			System.out.println(" Update fail");
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
			System.out.println("Delete success");
			return SQLConstants.MESSAGE_REMOVE_USER_SUCCESS;
		}else{
			System.out.println("Delete fail");
			return SQLConstants.MESSAGE_REMOVE_USER_FAILURE;
		}
	}
	
	

}
