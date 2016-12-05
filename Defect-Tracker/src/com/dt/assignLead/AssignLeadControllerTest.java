package com.dt.assignLead;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AssignLeadControllerTest {

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
	public void assignLeadSucTest() {
		String assigned_to="Team Lead";
		int defect_id=1001;
		assignLeadBiz defectListBiz=new assignLeadBiz();
		boolean flag=defectListBiz.assignDefectBiz(assigned_to,defect_id);
		assertEquals(flag,true);
	}
	@Test
	public void assignLeadTest() {
		String assigned_to="Tester";
		int defect_id=1104;
		assignLeadBiz defectListBiz=new assignLeadBiz();
		boolean flag=defectListBiz.assignDefectBiz(assigned_to,defect_id);
		assertNotEquals(flag,true);
	}

}
