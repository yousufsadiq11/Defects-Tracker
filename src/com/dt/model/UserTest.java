package com.dt.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

	@Test
	public void testGetUserName() {
	}

	@Test
	public void testSetUserName() {
		User user = new User();
		user.setUserName("anurag");
		String output=user.getUserName();
		assertEquals("anurag",output);		
		}

	@Test
	public void testGetEmail() {
	}

	@Test
	public void testSetEmail() {
		User user = new User();
		user.setEmail("atayade2@uncc.edu");
		String output=user.getEmail();
		assertEquals("atayade2@uncc.edu",output);		
		}

	@Test
	public void testGetRole() {
	}

	@Test
	public void testSetRole() {
		User user = new User();
		user.setRole("1");
		String output=user.getRole();
		assertEquals("1",output);		}

	@Test
	public void testGetModule() {
	}

	@Test
	public void testSetModule() {
		User user = new User();
		user.setModule("1");
		String output=user.getModule();
		assertEquals("1",output);		
		}

	@Test
	public void testGetPassword() {
	}

	@Test
	public void testSetPassword() {
		User user = new User();
		user.setPassword("abcd");
		String output=user.getPassword();
		assertEquals("abcd",output);		}

	@Test
	public void testGetUserId() {
	}

	@Test
	public void testSetUserId() {
		User user = new User();
		user.setUserId(2);
		int output=user.getUserId();
		assertEquals(2,output);		}

}
