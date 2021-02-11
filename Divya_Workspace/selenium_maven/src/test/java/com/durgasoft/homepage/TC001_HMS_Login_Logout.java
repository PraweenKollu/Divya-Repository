package com.durgasoft.homepage;

import org.testng.annotations.Test;
import com.durgasoft.basepage.BasePage;
import com.durgasoft.basepage.PageUI;

import atu.testrecorder.ATUTestRecorder;

import org.testng.annotations.BeforeTest;

public class TC001_HMS_Login_Logout extends BasePage {

	public ATUTestRecorder recorder;

	@Test(description = "This test case is to verify login & logout in HMS")
	public void hmsLoginLogout() throws Exception {
		PageUI p = new PageUI(driver);// HAS-A Relation
		p.hmsLogin();
		p.hmsLogout();
		recorder.stop();
	}

	@BeforeTest
	public void beforeTest() throws Exception {
		recorder = new ATUTestRecorder("E:\\recording", "hmslogin", false);
		recorder.start();
		browserLaunch("chrome", "http://seleniumbymahesh.com");
	}
}
