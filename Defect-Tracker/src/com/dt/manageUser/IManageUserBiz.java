/**
 * 
 */
package com.dt.manageUser;

/**
 * @author Abhishek
 *
 */
public interface IManageUserBiz {
	
	public String updateUserDetails(String user);
	
	public String removeUser(String user);

	public String updatePassword(String user);

}
