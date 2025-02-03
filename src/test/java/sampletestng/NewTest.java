package sampletestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
	
	@Test(description="This test is for regression1",priority=1)
	public void Test1() {
		
		System.out.println("Test1 method");
	}
	
	@Test(description="This test is for RegressionTest2",priority = 2,dependsOnMethods = "Test1")
	public void Test2() {
		Assert.assertTrue(false)	;
	}
	

	@Test(priority=3,dependsOnMethods="Test2",alwaysRun = true)
	public void Test3() {
		Assert.assertTrue(true);
	}

	@Test(priority=4,dependsOnMethods="Test3",alwaysRun = true)
	public void Test4() {
		System.out.println("In Test4");
	}
}
