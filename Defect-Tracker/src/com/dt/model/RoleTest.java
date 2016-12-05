package com.dt.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoleTest {

	@Test
	public void testGetRoleId() {
		
	}

	@Test
	public void testSetRoleId() {
		Role role = new Role();
		role.setRoleId(1);
		int output=role.getRoleId();
		assertEquals(1,output);
		
	}

	@Test
	public void testGetRoleName() {
	}

	@Test
	public void testSetRoleName() {
		Role role = new Role();
		role.setRoleName("Developer");
		String output=role.getRoleName();
		assertEquals("Developer",output);
	}

}
