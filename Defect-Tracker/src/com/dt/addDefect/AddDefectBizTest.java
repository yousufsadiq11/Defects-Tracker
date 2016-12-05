package com.dt.addDefect;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dt.model.Defect;

public class AddDefectBizTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void AddDefect(HttpServletRequest request){
		 Defect obj=new Defect();
		 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:MM");
		 obj.setAssigned_date(dateFormat.format("2016-11-13 17:11:00"));
		 obj.setDefect_name("login issue");
		 obj.setDefect_desc("unable to login");
		 obj.setAssigned_to("Team Lead");
		 obj.setDefect_status("Open");
		 obj.setDefect_type("UI");
		 obj.setSeverity("high");
		 obj.setModule_id(1);
		 AddDefectDao dao=new AddDefectDao();
		 int flag=dao.addDefect(obj);
		 System.out.println(flag);
		 assertEquals(flag,1);
	 }

}
