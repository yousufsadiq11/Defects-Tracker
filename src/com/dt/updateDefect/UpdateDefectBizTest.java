package com.dt.updateDefect;

import static org.junit.Assert.*;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dt.model.Defect;

public class UpdateDefectBizTest {

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
	public void updateDefectTest() {
		Defect obj=new Defect();
		 obj.setDefect_id(1001);
		 obj.setAssigned_date("2016-11-13 17:11:00");
		 obj.setDefect_name("login issue");
		 obj.setDefect_desc("unable to login");
		 obj.setAssigned_to("Team Lead");
		 obj.setDefect_status("Close");
		 obj.setDefect_type("UI");
		 obj.setSeverity("high");
		 obj.setModule_id(1);
		 UpdateDefectDAO dao=new UpdateDefectDAO();
		 int flag=dao.updateDefect(obj);
		 assertEquals(flag,1);
	}

}
