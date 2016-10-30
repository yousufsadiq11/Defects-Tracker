/**
 * 
 */
package com.dt.utility;

/**
 * @author Abhishek
 *
 */
public class SQLConstants {
	
	public static final String MESSAGE_USER_DETAILS_SUCCESS = "USER DETAILS UPDATED SUCCESSFULLY.";
	public static final String MESSAGE_USER_DETAILS_FAILURE = "FAILED TO UPDATE DETAILS. PLEASE TRY AGAIN.";
	public static final String MESSAGE_REMOVE_USER_SUCCESS = "USER REMOVED SUCCESSFULLY.";
	public static final String MESSAGE_REMOVE_USER_FAILURE = "FAILED TO REMOVE USER. PLEASE TRY AGAIN.";
	public static final String SUCCESS = "SUCCESS";
	public static final String FAILURE = "FAILURE";
	public static final String WARNING = "WARNING";
	
	public static final String GET_USER_LIST = "SELECT U.USER_ID,U.USER_NAME,U.EMAIL,(SELECT ROLE_NAME FROM ROLE WHERE ROLE_ID = U.ROLE_ID) ROLE,(SELECT MODULE_NAME FROM MODULE WHERE MODULE_ID = U.MODULE_ID) MODULE FROM USER U";
	public static final String GET_MODULE_LIST = "SELECT * FROM MODULE";
	public static final String GET_ROLE_LIST = "SELECT * FROM ROLE";
	public static final String UPDATE_USER_DETAILS = "UPDATE USER SET USER_NAME = ?, EMAIL = ?,ROLE_ID = (SELECT R.ROLE_ID FROM ROLE R WHERE R.ROLE_NAME = ?),MODULE_ID = (SELECT M.MODULE_ID FROM MODULE M WHERE M.MODULE_NAME = ?) WHERE USER_ID = ?";
	public static final String REMOVE_USER = "DELETE FROM USER WHERE USER_ID = ?";
	
	

}
