package com.dt.manageUser;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dt.referenceData.GetReferenceDataBiz;
import com.dt.referenceData.IGetReferenceDataBiz;

public class ManageUserControllerTest {

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
	public void manageUserTest() {
		IGetReferenceDataBiz getReferenceDataBiz = new GetReferenceDataBiz();
		String listOfModules = getReferenceDataBiz.getModuleList();
		String listOfRoles = getReferenceDataBiz.getRoleList();
		String selectedUser = "atayade4@uncc.edu";
		assertNotEquals(listOfModules,null);
		assertNotEquals(listOfRoles ,null);
		assertNotEquals(selectedUser,null);
	}
}
