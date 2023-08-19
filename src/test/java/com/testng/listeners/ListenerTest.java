package com.testng.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" skipped");
	}

}
