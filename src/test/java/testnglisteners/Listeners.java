package testnglisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test Execution start");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test execution pass");
	
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Execution fail");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test Execution skip");
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Tests Execution Start");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("Tests Execution Completed");
	}
	
	

}
