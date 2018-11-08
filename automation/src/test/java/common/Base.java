package common;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class Base {

	/*
	 * Base contains all the methods required to setup and tear down each test such
	 * as driver initialization, device and browser selection, etc...
	 */

	Constraints constraint = new Constraints();
	Methods method = new Methods();

	@BeforeSuite
	public void setup() {
		System.out.println("Setting up the test.");
		method.getReport("html");
		Assert.assertTrue(true, "Setting up the test");
	}

	@AfterSuite
	public void teardown() {
		System.out.println("Tearing down the test.");
		method.closeReport("html");
		Assert.assertTrue(true, "Tearing down the test.");
	}
}