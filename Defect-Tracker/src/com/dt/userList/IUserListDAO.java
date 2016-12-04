/**
 * 
 */
package com.dt.userList;

import java.util.ArrayList;

import com.dt.model.User;

/**
 * @author Abhishek
 *
 */
public interface IUserListDAO {

	public ArrayList<User> getUserList();
	public User getUserDetails(User user);

}
