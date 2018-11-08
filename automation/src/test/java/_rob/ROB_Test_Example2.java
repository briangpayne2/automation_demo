package _rob;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import common.Constraints;
import common.Methods;

public class ROB_Test_Example2 {

	Constraints constraint = new Constraints();
	Methods method = new Methods();
	
	@Test
	public void step_1_2() throws IOException {
		method.createTestName("ROB_Test_2");
		System.out.println("Executing step 1 of Test 2");
		Reporter.log("Executing step 1 of Test 2");
		Reporter.log("<a href='" + constraint.screenshot_path()
				+ "8e49374f-50e2-4b7d-9234-a02bef4bc789-attachment.png'> <img src='" + constraint.screenshot_path()
				+ "8e49374f-50e2-4b7d-9234-a02bef4bc789-attachment.png' height='100' width='100'/> </a>");
		Assert.assertEquals(true, true);
		method.reportPass("Step 1 of 2 passed.")
		.addScreenCaptureFromPath(constraint.screenshot_path(),
				"8e49374f-50e2-4b7d-9234-a02bef4bc789-attachment.png");
	}

	@Test
	public void step_2_2() throws IOException {
		System.out.println("Executing step 2 of Test 2");
		Reporter.log("Executing step 2 of Test 2");
		Reporter.log("<a href='" + constraint.screenshot_path()
				+ "a5919192-788d-4b77-912b-482a5b32cb56-attachment.png'> <img src='" + constraint.screenshot_path()
				+ "a5919192-788d-4b77-912b-482a5b32cb56-attachment.png' height='100' width='100'/> </a>");
		Assert.assertEquals(false, true);
		method.reportFail("Step 2 of 2 failed.")
			.addScreenCaptureFromPath(constraint.screenshot_path(),
				"a5919192-788d-4b77-912b-482a5b32cb56-attachment.png");
	}

}