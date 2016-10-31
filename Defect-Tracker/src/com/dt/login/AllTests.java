package com.dt.login;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ LoginBizTest.class, LoginDAOTest.class })
public class AllTests {

}
