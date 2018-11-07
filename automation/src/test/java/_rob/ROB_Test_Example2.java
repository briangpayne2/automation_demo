package _rob;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ROB_Test_Example2 {

	@Test
	public void step_1_2() {
		System.out.println("Executing step 1 of Test 2");
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void step_2_2() {
		System.out.println("Executing step 2 of Test 2");
		Assert.assertEquals(true, true);
	}
	
}