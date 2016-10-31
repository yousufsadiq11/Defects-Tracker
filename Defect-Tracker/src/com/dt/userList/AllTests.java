package com.dt.userList;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ UserListBizTest.class, UserListDAOTest.class })
public class AllTests {

}
