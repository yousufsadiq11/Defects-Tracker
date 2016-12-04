package com.dt.addUser;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dt.model.User;

public class AddUserBizTest {

	@Test
	public void addUserBizTest() {
		User obj=new User();

		 obj.setEmail("atayade3@uncc.edu");
		 obj.setPassword("abcd");
		 AddUserDAO dao=new AddUserDAO();
		 int flag=dao.addUser(obj);
		 assertEquals(1,flag);
	}

}
