package com.dt.defectsList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dt.model.Defect;
import com.dt.utility.DBUtility;
import com.dt.utility.SQLConstants;

public class defectListDao {

	
public ArrayList<Defect> getDefectList() {
		
		ArrayList<Defect> listOfDefects = new ArrayList<Defect>();
		
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement stmt = con.prepareStatement(SQLConstants.GET_ALL_DEFECT_LIST);
			ResultSet resultSet = stmt.executeQuery();
			while(resultSet.next()){
				Defect defect = new Defect();
				defect.setDefect_id(resultSet.getInt("defect_id"));
				defect.setDefect_name(resultSet.getString("defect_name"));
				defect.setDefect_desc(resultSet.getString("defect_desc"));
				defect.setDefect_status(resultSet.getString("defect_status"));
				listOfDefects.add(defect);
			}
			DBUtility.closeConnection(con);
		} catch (SQLException e) {
			System.err.println("ERROR : \nSQL Error Code : "+e.getErrorCode()+" SQL State : "+e.getSQLState());
		}
		return listOfDefects;
	}
	
}
