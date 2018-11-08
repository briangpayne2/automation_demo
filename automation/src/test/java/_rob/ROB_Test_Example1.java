package _rob;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import common.Base;
import common.Constraints;
import common.Methods;

public class ROB_Test_Example1 {
	
	Constraints constraint = new Constraints();
	Base base = new Base();
	Methods method = new Methods();
	
	
	
	@Test
	public void step_1_1() throws IOException {
		method.createTestName("ROB_Test_1");
		System.out.println("Executing step 1 of Test 1");
		Reporter.log("Executing step 1 of Test 1");
		Reporter.log("<a href='"+ constraint.screenshot_path() + 
				"0dbdf015-fa32-44b0-bf5b-109b3a16d855-attachment.png'> <img src='"+ 
				constraint.screenshot_path() + 
				"0dbdf015-fa32-44b0-bf5b-109b3a16d855-attachment.png' height='100' width='100'/> </a>");
		Assert.assertEquals(true, true);
		method.reportPass("Step 1 of 1 passed.")
			.addScreenCaptureFromPath(constraint.screenshot_path(),
					"0dbdf015-fa32-44b0-bf5b-109b3a16d855-attachment.png");
	}
	
	@Test
	public void step_2_1() throws IOException {
		System.out.println("Executing step 2 of Test 1");
		Reporter.log("Executing step 2 of Test 1");
		Reporter.log("<a href='"+ constraint.screenshot_path() + 
				"7f9b13d4-fb3b-4e15-92b3-67c22245b6b2-attachment.png'> <img src='"+ 
				constraint.screenshot_path() + 
				"7f9b13d4-fb3b-4e15-92b3-67c22245b6b2-attachment.png' height='100' width='100'/> </a>");
		Assert.assertEquals(true, true);
		method.reportPass("Step 2 of 1 passed.")
			.addScreenCaptureFromPath(constraint.screenshot_path(),
				"7f9b13d4-fb3b-4e15-92b3-67c22245b6b2-attachment.png");
	}
	
}