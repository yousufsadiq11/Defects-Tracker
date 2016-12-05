package com.dt.utility;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SendMailTest {

	SendMail mailer = new SendMail();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testSendMail() {
		mailer.sendMail("defect.tracker.app@gmail.com");
	}
	
	@Test
	public final void testSendMailFail() {
		mailer.sendMail("defect");
	}
	
	

}
