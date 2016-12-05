package com.dt.addUser;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dt.model.User;

public class AddUserBizTest {

	@Test
	public void addUserBizSucTest() {
		User obj=new User();

		 obj.setEmail("atayade9@uncc.edu");
		 obj.setPassword("abcd");
		 AddUserDAO dao=new AddUserDAO();
		 int flag=dao.addUser(obj);
		 assertEquals(1,flag);
	}
	@Test
	public void addUserBizFailTest() {
		User obj=new User();

		 obj.setEmail("atayade4@uncc.edu");
		 obj.setPassword("abcd");
		 AddUserDAO dao=new AddUserDAO();
		 int flag=dao.addUser(obj);
		 assertEquals(1,flag);
	}
}
