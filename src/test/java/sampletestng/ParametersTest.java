package sampletestng;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	/**
	 * There are three ways to set these parameters

			1. The testng.xml file

			2. Programmatically

			3. Java system properties

	 * @param firstName
	 */
	
	@Parameters({"first-name"})
	@Test(description = "Firstway of setting parameter")
	public void testSingleString(String firstName) {
		
		System.out.println("invoked testString : " +  firstName);
		Assert.assertEquals("Bhargavi",firstName,"Both Strings are not equal");
		
		}
}
