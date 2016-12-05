/**
 * 
 */
package com.dt.manageUser;

import com.dt.model.User;

/**
 * @author Abhishek
 *
 */
public interface IManageUserDAO {

	int updateUserDetails(User user);

	int deleteUser(User user);

	int updatePassword(User obj);

}
