package test.com.dt.addDefect;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AddDefectBizTest.class, AddDefectDaoTest.class })
public class AllTests {

}
