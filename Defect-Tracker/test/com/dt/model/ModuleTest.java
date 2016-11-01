package com.dt.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModuleTest {

	@Test
	public void testGetModuleId() {
	}

	@Test
	public void testSetModuleId() {
		Module module = new Module();
		module.setModuleId(1);
		int output=module.getModuleId();
		assertEquals(1,output);
	}

	@Test
	public void testGetModuleName() {
	}

	@Test
	public void testSetModuleName() {
		Module module = new Module();
		module.setModuleName("Store");
		String output=module.getModuleName();
		assertEquals("Store",output);
	}

}
