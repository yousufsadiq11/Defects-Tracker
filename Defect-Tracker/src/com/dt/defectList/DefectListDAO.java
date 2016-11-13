/**
 * 
 */
package com.dt.defectList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dt.model.Defect;
import com.dt.model.User;
import com.dt.utility.DBUtility;
import com.dt.utility.SQLConstants;

/**
 * @author Abhishek
 *
 */
public class DefectListDAO implements IDefectListDAO{

	@Override
	public ArrayList<Defect> getDefectList(User user) {
		ArrayList<Defect> listOfDefects = new ArrayList<Defect>();
		
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement stmt = con.prepareStatement(SQLConstants.GET_DEFECT_LIST);
			stmt.setString(1, user.getRole());
			ResultSet resultSet = stmt.executeQuery();
			while(resultSet.next()){
				Defect defect = new Defect();
				defect.setDefect_id(resultSet.getInt("defect_id"));
				defect.setDefect_name(resultSet.getString("defect_name"));
				defect.setDefect_desc(resultSet.getString("defect_desc"));
				defect.setDefect_status(resultSet.getString("defect_status"));
				defect.setDefect_type(resultSet.getString("defect_type"));
				defect.setModule_id(resultSet.getInt("module_id"));
				defect.setSeverity(resultSet.getString("severity"));
				defect.setAssigned_to(resultSet.getString("assigned_to"));
				defect.setAssigned_date(resultSet.getString("assigned_date"));
				listOfDefects.add(defect);
			}
			DBUtility.closeConnection(con);
		} catch (SQLException e) {
			System.err.println("ERROR : \nSQL Error Code : "+e.getErrorCode()+" SQL State : "+e.getSQLState());
		}
		return listOfDefects;
	}

	@Override
	public Defect getDefectDetails(Defect defect) {
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement stmt = con.prepareStatement(SQLConstants.GET_DEFECT_DETAILS);
			stmt.setInt(1, defect.getDefect_id());
			ResultSet resultSet = stmt.executeQuery();
			while(resultSet.next()){
				defect.setDefect_name(resultSet.getString("defect_name"));
				defect.setDefect_desc(resultSet.getString("defect_desc"));
				defect.setDefect_status(resultSet.getString("defect_status"));
				defect.setDefect_type(resultSet.getString("defect_type"));
				defect.setModule_id(resultSet.getInt("module_id"));
				defect.setSeverity(resultSet.getString("severity"));
				defect.setAssigned_to(resultSet.getString("assigned_to"));
				defect.setAssigned_date(resultSet.getString("assigned_date"));
			}
			DBUtility.closeConnection(con);
		} catch (SQLException e) {
			System.err.println("ERROR : \nSQL Error Code : "+e.getErrorCode()+" SQL State : "+e.getSQLState());
		}
		return defect;
	}
	
	
}
