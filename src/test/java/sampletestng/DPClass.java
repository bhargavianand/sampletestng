package sampletestng;

import org.testng.annotations.Test;

public class DPClass {
	
	@Test(dataProvider="createTestData23", dataProviderClass=StaticProvider.class)
	public void test(Integer n) {
		System.out.println("Value retrieved is " + n );
	
	}

}
