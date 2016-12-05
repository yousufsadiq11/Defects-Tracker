package com.dt.login;

import static org.junit.Assert.*;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dt.model.User;


public class LoginControllerTest {

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
	//Valid Username and Password
	public void loginSuccessTest() {
		boolean flag;
		User user= new User();
		user.setEmail("atayade2@uncc.edu");
		user.setPassword("abcd");
	    ILoginBiz loginBiz = new LoginBiz();
		
	    flag=loginBiz.isValidLogin(user);
		assertEquals(flag,true);
	}
	@Test
	//Invalid Username 

	public void loginFailTest() {
		boolean flag;
		User user= new User();
		user.setEmail("atayade10@uncc.edu");
		user.setPassword("abcd");
	    ILoginBiz loginBiz = new LoginBiz();
		
	    flag=loginBiz.isValidLogin(user);
		assertEquals(flag,false);
	}

	@Test
	//Invalid Password
	public void loginPasswordFailTest() {
		boolean flag;
		User user= new User();
		user.setEmail("atayade2@uncc.edu");
		user.setPassword("abcde");
	    ILoginBiz loginBiz = new LoginBiz();
		
	    flag=loginBiz.isValidLogin(user);
		assertEquals(flag,false);
	}
}
