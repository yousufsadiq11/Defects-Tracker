package com.dt.utility;

import static org.junit.Assert.assertNotEquals;

import java.sql.Connection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DBUtilityTest {


	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetConnection() {
		Connection con = DBUtility.getConnection();
		assertNotEquals(con, null);
	}

	@Test
	public final void testGetConnectionToTestDB() {
		Connection con = DBUtility.getConnectionToTestDB();
		assertNotEquals(con, null);
	}


}
