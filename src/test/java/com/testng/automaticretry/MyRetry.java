package com.testng.automaticretry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer,ITestListener{
	private int retryCount = 0;
	  private static final int maxRetryCount = 3;
	 
	  @Override
	  public boolean retry(ITestResult result) {
	    if (retryCount < maxRetryCount) {
	      retryCount++;
	      return true;
	    }
	    return false;
	  }


}
