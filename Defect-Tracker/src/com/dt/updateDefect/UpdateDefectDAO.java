package com.dt.updateDefect;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.dt.model.Defect;
import com.dt.utility.DBUtility;
import com.dt.utility.SQLConstants;

public class UpdateDefectDAO {
	public int updateDefect(Defect dao) {
		// TODO Auto-generated method stub
		int x=0;
		Connection conn=DBUtility.getConnection();
		try{
			
		PreparedStatement pst = conn.prepareStatement(SQLConstants.UPDATE_DEFECT);
	//	PreparedStatement pst1=conn.prepareStatement(SQLConstants.MAX_DEFECT_ID);
	//	ResultSet rs1=pst1.executeQuery();
	//	while(rs1.next()){
	//		max_id=rs1.getInt(1);
	//	}
	//	
		pst.setString(1, dao.getDefect_name());
		pst.setString(2,dao.getDefect_desc());
		pst.setString(3,dao.getAssigned_to());
		pst.setString(4, dao.getAssigned_date());
		pst.setString(5, dao.getDefect_status());
		pst.setString(6,dao.getDefect_type());
		pst.setString(7, dao.getSeverity());
		pst.setInt(8, dao.getModule_id());
		pst.setString(9, dao.getComments());
		pst.setInt(10, dao.getDefect_id());
		
		x = pst.executeUpdate();
		DBUtility.closeConnection(conn);

		}
		catch(Exception e){
		e.printStackTrace();
		}
		return x;
	}
}
