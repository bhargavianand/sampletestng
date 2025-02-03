package sampletestng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions_soft {
	
	@Test(description = "Testing the softassert")
	public void validateTitleTest()
	{	
		System.out.println("beginning");
		String expectedTitle = "MyTitle";
		String actualTitle = "Title1";	
		SoftAssert softassert = new SoftAssert();
		System.out.println("Validating title");	
		softassert.assertEquals(actualTitle,expectedTitle,"title is not matching");
		softassert.fail("Failing as condition is not met");
		softassert.assertTrue(true,"This condition passed");
		System.out.println("ending");	
		softassert.assertAll();
	}

}
