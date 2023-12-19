package com.BankProject.HooksClass;

import com.BankProject.BaseClass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	
	@Before
	public void beforeHook() {
		launchBrowser(browser,url);
		logger.info("chrome browser started and url hit successfully");
	}
	@After(order=1)
	public void afterHook2() {
		quitBrowser();
		logger.info("chrome browser closed successfully");
	}
	@After(order=2)
	public void afterHook1() {
		captureScreenshot1(driver,"para bank functional testing");
		logger.info("screenshot capture successfully");
	}

}
