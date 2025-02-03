package sampletestng;

import org.testng.annotations.DataProvider;

public class StaticProvider {
	
	@DataProvider(name="testData23")
	public Object[][] createTestData23(){
		return new Object[][] {
			new Object[] {42}
		};
	}
}
