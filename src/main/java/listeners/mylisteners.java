package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import generic.Basetest;

public class mylisteners implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		String scriptName = result.getMethod().getMethodName();
		Basetest.util.captureScreenshot(scriptName);
	}
}
