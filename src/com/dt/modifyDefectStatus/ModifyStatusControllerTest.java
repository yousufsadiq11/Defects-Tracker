package com.dt.modifyDefectStatus;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ModifyStatusControllerTest {

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
	public void modifyDefectTest() {
		String defect_status="Open";
		int defect_id=1001;
		modifyDefectStatusBiz defectListBiz=new modifyDefectStatusBiz();
		boolean flag=defectListBiz.assignDefectBiz(defect_status,defect_id);
		assertEquals(flag,true);
	}
	@Test
	public void modifyDefectFailTest() {
		String defect_status="Open";
		int defect_id=1025;
		modifyDefectStatusBiz defectListBiz=new modifyDefectStatusBiz();
		boolean flag=defectListBiz.assignDefectBiz(defect_status,defect_id);
		assertNotEquals(flag,true);
	}

}
