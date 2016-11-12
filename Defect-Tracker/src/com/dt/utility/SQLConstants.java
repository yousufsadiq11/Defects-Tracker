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
	public static final Object TYPE_CONTROLLER = "CONTROLLER";
	public static final Object TYPE_PAGE = "PAGE";
	
	public static final String CHECK_LOGIN = "SELECT * FROM LOGIN WHERE LOGIN_ID=? AND PASSWORD=?";
	public static final String GET_USER_LIST = "SELECT U.USER_ID,U.USER_NAME,U.EMAIL,(SELECT ROLE_NAME FROM ROLE WHERE ROLE_ID = U.ROLE_ID) ROLE,(SELECT MODULE_NAME FROM MODULE WHERE MODULE_ID = U.MODULE_ID) MODULE FROM USER U WHERE U.ROLE_ID NOT IN (SELECT ROLE_ID FROM ROLE WHERE ROLE_NAME = 'ADMIN')";
	public static final String GET_MODULE_LIST = "SELECT * FROM MODULE";
	public static final String GET_ROLE_LIST = "SELECT * FROM ROLE";
	public static final String UPDATE_USER_DETAILS = "UPDATE USER SET USER_NAME = ?, EMAIL = ?,ROLE_ID = (SELECT R.ROLE_ID FROM ROLE R WHERE R.ROLE_NAME = ?),MODULE_ID = (SELECT M.MODULE_ID FROM MODULE M WHERE M.MODULE_NAME = ?) WHERE USER_ID = ?";
	public static final String REMOVE_USER = "DELETE FROM USER WHERE USER_ID = ?";
	public static final String REMOVE_USER_LOGIN = "DELETE FROM LOGIN WHERE USER_ID = ?";
	public static final String GET_USER_DETAILS = "SELECT U.USER_ID,U.USER_NAME,U.EMAIL,(SELECT ROLE_NAME FROM ROLE WHERE ROLE_ID = U.ROLE_ID) ROLE,(SELECT MODULE_NAME FROM MODULE WHERE MODULE_ID = U.MODULE_ID) MODULE FROM USER U WHERE U.EMAIL=?";
	public static final String MAX_DEFECT_ID="select max(defect_id) from defect";
	public static final String MODULE_ID="select module_id from module";
	public static final String ROLE_NAME="select role_name from role";
	public static final String ADD_DEFECT="insert into defect values(?,?,?,?,?,?,?,?,?,?)";
	public static final String ADD_USER="INSERT INTO LOGIN(login_id,password) VALUES(?,?)";
	public static final String INSERT_USER="INSERT INTO USER(EMAIL) VALUES(?)";
	public static final String UPDATE_DEFECT="UPDATE defect SET DEFECT_NAME=?,DEFECT_DESC=?,ASSIGNED_TO=?,ASSIGNED_DATE=?,DEFECT_STATUS=?,DEFECT_TYPE=?,SEVERITY=?,MODULE_ID=?,COMMENTS=?)";

}
