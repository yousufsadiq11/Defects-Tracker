package com.dt.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class DefectTest {

	@Test
	public void testGetDefect_id() {
	}

	@Test
	public void testSetDefect_id() {
		Defect defect = new Defect();
		defect.setDefect_id(1);
		int output=defect.getDefect_id();
		assertEquals(1,output);
	}

	@Test
	public void testGetDefect_name() {
	}

	@Test
	public void testSetDefect_name() {
		Defect defect = new Defect();
		defect.setDefect_name("Login");
		String output=defect.getDefect_name();
		assertEquals("Login",output);
	}

	@Test
	public void testGetDefect_desc() {
	}

	@Test
	public void testSetDefect_desc() {
		Defect defect = new Defect();
		defect.setDefect_desc("Unable to login");
		String output=defect.getDefect_desc();
		assertEquals("Unable to login",output);
	}

	@Test
	public void testGetAssigned_to() {
	}

	@Test
	public void testSetAssigned_to() {
		Defect defect = new Defect();
		defect.setAssigned_to("Developer");
		String output=defect.getAssigned_to();
		assertEquals("Developer",output);	
		}

	@Test
	public void testGetAssigned_date() {
	}

	@Test
	public void testSetAssigned_date() {
		Defect defect = new Defect();
		defect.setAssigned_date("2016-11-01 13:11:00");
		String output=defect.getAssigned_date();
		assertEquals("2016-11-01 13:11:00",output);		
		}

	@Test
	public void testGetDefect_status() {
	}

	@Test
	public void testSetDefect_status() {
		Defect defect = new Defect();
		defect.setDefect_status("New");
		String output=defect.getDefect_status();
		assertEquals("New",output);		
		}

	@Test
	public void testGetDefect_type() {
	}

	@Test
	public void testSetDefect_type() {
		Defect defect = new Defect();
		defect.setDefect_type("UI");
		String output=defect.getDefect_type();
		assertEquals("UI",output);	
		}

	@Test
	public void testGetSeverity() {
	}

	@Test
	public void testSetSeverity() {
		Defect defect = new Defect();
		defect.setSeverity("moderate");
		String output=defect.getSeverity();
		assertEquals("moderate",output);	
		}

	@Test
	public void testGetModule_id() {
	}

	@Test
	public void testSetModule_id() {
		Defect defect = new Defect();
		defect.setModule_id(1);
		int output=defect.getModule_id();
		assertEquals(1,output);	
		}

}
