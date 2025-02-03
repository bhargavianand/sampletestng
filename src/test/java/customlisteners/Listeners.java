package customlisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Pass Test Link" + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("<a href= \"C:\\Users\\bharg\\OneDrive\\Desktoperror.jpg\">Error SreenShot Link</a>" );
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}
	
	

}
