package com.dt.updateDefect;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.dt.model.Defect;

public class UpdateDefectBizTest {

	@Test
	public void test() {
		Defect obj=new Defect();
		 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:MM");
		 Date date = new Date();
		 obj.setAssigned_date(dateFormat.format(date));
		 obj.setDefect_id(1005);
		 obj.setDefect_name("login issue new");
		 obj.setDefect_desc("unable to login1");
		 obj.setAssigned_to("Team Lead");
		 obj.setDefect_status("New");
		 obj.setDefect_type("UI");
		 obj.setSeverity("low");
		 //System.out.println("abcdefghjid");
		 obj.setComments("abcdefghjid");
		 obj.setModule_id(1);
		 UpdateDefectDAO dao=new UpdateDefectDAO();
		 int flag=dao.updateDefect(obj);
		 assertEquals(1,flag);
	 }
	}

