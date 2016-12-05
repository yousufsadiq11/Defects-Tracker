package com.dt.updateDefect;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.dt.model.Defect;

public class UpdateDefectBiz {
	public int updateDefect(HttpServletRequest request){
		 Defect obj=new Defect();
		 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:MM");
		 Date date = new Date();
		 obj.setAssigned_date(dateFormat.format(date));
		 obj.setDefect_id(Integer.parseInt(request.getParameter("defect_id").toString()));
		 obj.setDefect_name(request.getParameter("defect_name"));
		 obj.setDefect_desc(request.getParameter("defect_desc"));
		 obj.setAssigned_to(request.getParameter("assigned_to"));
		 obj.setDefect_status(request.getParameter("defect_status"));
		 obj.setDefect_type(request.getParameter("defect_type"));
		 obj.setSeverity(request.getParameter("severity"));
		 System.out.println(request.getParameter("comment"));
		 obj.setComments(request.getParameter("comment"));
		 obj.setModule_id(Integer.parseInt(request.getParameter("module_id").toString()));
		 UpdateDefectDAO dao=new UpdateDefectDAO();
		 int flag=dao.updateDefect(obj);
		 return flag;
	 }
}
