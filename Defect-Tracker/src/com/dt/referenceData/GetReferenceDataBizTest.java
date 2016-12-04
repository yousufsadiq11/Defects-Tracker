package com.dt.referenceData;

import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dt.model.Module;
import com.dt.model.Role;

public class GetReferenceDataBizTest {
	IGetReferenceDataDAO getReferenceDataDAO;

	@Before
	public void setUp() throws Exception {
		getReferenceDataDAO = new GetReferenceDataDAO();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetModuleList() {
		List<Module> listOfModules =  getReferenceDataDAO.getModuleList();
		assertNotEquals(listOfModules, null);
		
	}

	@Test
	public final void testGetRoleList() {
		List<Role> listOfRoles =  getReferenceDataDAO.getRoleList();
		assertNotEquals(listOfRoles, null);
		
	}
	

}
