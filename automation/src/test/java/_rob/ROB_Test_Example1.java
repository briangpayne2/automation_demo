package _rob;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ROB_Test_Example1 {
	
	@Test
	public void step_1_1() {
		System.out.println("Executing step 1 of Test 1");
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void step_2_1() {
		System.out.println("Executing step 2 of Test 1");
		Assert.assertEquals(true, true);
	}
	
}