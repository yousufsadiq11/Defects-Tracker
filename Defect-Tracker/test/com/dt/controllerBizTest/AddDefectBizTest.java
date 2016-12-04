package com.dt.addDefect;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.dt.model.Defect;

public class AddDefectBizTest {

	@Test
	public void AddDefectBiztest() {
		Defect obj=new Defect();
		 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:MM");
		 Date date = new Date();
		 obj.setAssigned_date(dateFormat.format(date));
		 obj.setDefect_name("login_user");
		 obj.setDefect_desc("not able to login");
		 obj.setAssigned_to("Team Lead");
		 obj.setDefect_status("New");
		 obj.setDefect_type("UI");
		 obj.setSeverity("high");
		 obj.setModule_id(1);
		 AddDefectDao dao=new AddDefectDao();
		 int flag=dao.addDefect(obj);
		 assertEquals(1,flag);
	}

}
