package com.dt.assignLead;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dt.model.Defect;
import com.dt.utility.DBUtility;
import com.dt.utility.SQLConstants;

public class assignLeadDao {

	
public ArrayList<Defect> getDefectList() {
		
		ArrayList<Defect> listOfDefects = new ArrayList<Defect>();
		
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement stmt = con.prepareStatement(SQLConstants.GET_DEFECT_LIST);
			stmt.setString(1, "undefined");
			ResultSet resultSet = stmt.executeQuery();
			while(resultSet.next()){
				Defect defect = new Defect();
				defect.setDefect_id(resultSet.getInt("defect_id"));
				defect.setDefect_name(resultSet.getString("defect_name"));
				defect.setDefect_status(resultSet.getString("defect_status"));
				listOfDefects.add(defect);
			}
			DBUtility.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listOfDefects;
	}

public boolean assignLeadDao(String assigned_to, int id) {
	// TODO Auto-generated method stub
	boolean flag=false;
	try {
		
		Connection con = DBUtility.getConnection();
		PreparedStatement stmt = con.prepareStatement(SQLConstants.SET_DEFECT_LEAD);
		stmt.setString(1, assigned_to);
		stmt.setInt(2, id);
		
		int x = stmt.executeUpdate();
		if(x>0)flag=true;
		DBUtility.closeConnection(con);
	} catch (Exception ee) {
		ee.printStackTrace();
		
	}
	
	return flag;
	
}

public String getDefectDescription(int id) {
	// TODO Auto-generated method stub
	String defect_name=null;
	String defect_desc=null;
	String defect_status=null;
	String severity=null;
	String mail_text=null;
	try {
		
		Connection con = DBUtility.getConnection();
		PreparedStatement stmt = con.prepareStatement(SQLConstants.GET_DEFECT_DETAILS);
		stmt.setInt(1, id);
		
		
		
		
		ResultSet rs = stmt.executeQuery();
		while(rs.next()){
			defect_name=rs.getString(2);
		System.out.println("name"+defect_name);
		defect_desc=rs.getString(3);
		defect_status=rs.getString(6);
		severity=rs.getString(8);
		}
		mail_text="Defect Name: "+defect_name+'\n'+"Defect Description: "+defect_desc+"\n"+"Defect Status: "+defect_status+"\nSeverity: "+severity;
		DBUtility.closeConnection(con);
	} 
	catch (Exception ee) {
		ee.printStackTrace();
		
	}
	return mail_text;
	

	
}
	
}
