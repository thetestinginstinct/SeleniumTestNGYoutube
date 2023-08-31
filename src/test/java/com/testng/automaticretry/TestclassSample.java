package com.testng.automaticretry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestclassSample {
	
	@Test(retryAnalyzer = MyRetry.class)
	public void RetryTest() {
	Assert.fail();
	}
}
