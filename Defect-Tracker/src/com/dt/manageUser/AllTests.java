package com.dt.manageUser;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ManageUserBizTest.class, ManageUserDAOTest.class })
public class AllTests {

}
