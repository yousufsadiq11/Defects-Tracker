package com.dt.addDefect;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dt.model.AddDefect;

public class AddDefectBiz {
 public int AddDefect(HttpServletRequest request){
	 AddDefect obj=new AddDefect();
	 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:MM");
	 Date date = new Date();
	 obj.setAssigned_date(dateFormat.format(date));
	 obj.setDefect_name(request.getParameter("defect_name"));
	 obj.setDefect_desc(request.getParameter("defect_desc"));
	 obj.setAssigned_to(request.getParameter("assigned_to"));
	 obj.setDefect_status(request.getParameter("defect_status"));
	 obj.setDefect_type(request.getParameter("defect_type"));
	 obj.setSeverity(request.getParameter("severity"));
	 obj.setModule_id(Integer.parseInt(request.getParameter("module_id")));
	 AddDefectDao dao=new AddDefectDao();
	 int flag=dao.addDefect(obj);
	 return flag;
 }
}
