package common;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {

	/*
	 * Base contains all the methods required to setup and
	 * tear down each test such as driver initialization, 
	 * device and browser selection, etc...
	 */
	
	@BeforeTest
	protected void setup() {
		System.out.println("Setting up the test.");
		Assert.assertTrue(true, "Setting up the test");
	}

	@AfterTest
	protected void teardown() {
		System.out.println("Tearing down the test.");
		Assert.assertTrue(true, "Tearing down the test.");
	}
}