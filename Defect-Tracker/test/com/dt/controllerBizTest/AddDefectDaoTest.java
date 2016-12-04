package com.dt.addDefect;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.junit.Test;

import com.dt.utility.DBUtility;
import com.dt.utility.SQLConstants;

public class AddDefectDaoTest {

	@Test
	public void addDefectDaoTest() {
		int x=0;
		Connection conn=DBUtility.getConnection();
		try{
			
		PreparedStatement pst = conn.prepareStatement(SQLConstants.ADD_DEFECT);
	
		pst.setString(1,"login_user");
		pst.setString(2,"not able to login");
		pst.setString(3,"Team Lead");
		pst.setString(4,"2016-11-13 17:11:00");
		pst.setString(5,"New");
		pst.setString(6,"UI");
		pst.setString(7,"high");
		pst.setInt(8,1);
		
		x = pst.executeUpdate();
		DBUtility.closeConnection(conn);
		}
		catch(Exception e){
		e.printStackTrace();
		}
		 assertEquals(0,x);
	}

}
