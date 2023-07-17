package com.testng.runmultiplexmlfiles;

import org.testng.annotations.Test;

public class RegressionTest {

	@Test(priority=0)
	public void testFive() {
		System.out.println("RegressionTest-testFive");
	}
	@Test(priority=1)
	public void testSix() {
		System.out.println("RegressionTest-testSix");
	}
}
