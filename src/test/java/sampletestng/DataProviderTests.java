package sampletestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTests {

	@DataProvider(name = "testData1")
	public Object[][] createTestData() {
		return new Object[][] { { "Cedric", 35 }, { "Arty", 32 } };
	}

	@Test(dataProvider = "testData1")
	public void verifyData1Test(String name, int age) {
		System.out.println("VerifyData1 Test");
		System.out.println("Name : = " + name + "Age = " + age);
	}

	@Test(dataProvider = "testData1")
	public void verifyData2Test(String name, int age) {
		System.out.println("VerifyData2 Test");
		System.out.println("Name : = " + name + "Age = " + age);
	}

}
