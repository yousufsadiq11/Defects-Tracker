/**
 * 
 */
package com.dt.userList;

import java.util.ArrayList;
import java.util.List;

import com.dt.model.User;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;

/**
 * @author Abhishek
 *
 */
public class UserListBiz implements IUserListBiz{

	/**
	 * 
	 */
	public UserListBiz() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getUserList() {
		List<User> listOfUsers = new ArrayList<User>();
		
		IUserListDAO userListDAO = new UserListDAO();
		listOfUsers = userListDAO.getUserList();
		
		
		JsonArray jsonArray = new JsonArray();
		jsonArray = (JsonArray) new Gson().toJsonTree(listOfUsers,
	            new TypeToken<List<User>>() {
	            }.getType());
		
		return jsonArray.toString();
	}

	@Override
	public String getUserDetails(User user) {
		IUserListDAO userListDAO = new UserListDAO();
		user = userListDAO.getUserDetails(user);
		return new Gson().toJson(user, new TypeToken<User>(){}.getType());
	}

}
