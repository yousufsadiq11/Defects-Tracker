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
			stmt.setString(1, "unassigned");
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
	} catch (SQLException e) {
		System.err.println("ERROR : \nSQL Error Code : "+e.getErrorCode()+" SQL State : "+e.getSQLState());
	}
	
	return flag;
}
	
}
