package com.dt.userList;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserListControllerTest {

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
	public final void testDoPostHttpServletRequestHttpServletResponse() {
		IUserListBiz userListBiz = new UserListBiz();
		String listofUsers = userListBiz.getUserList();
		assertNotEquals(listofUsers, null);
	}

}
