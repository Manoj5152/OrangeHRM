package Listener1;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

public class ListenersExample implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case is going to execute");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case is failed.");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case is skipped.");
	}


	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("before everything");
}


  @Override public void onFinish(ITestContext context) { 
	  System.out.println("after everything");
  }
  }
