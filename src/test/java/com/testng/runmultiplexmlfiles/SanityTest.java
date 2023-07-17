package com.testng.runmultiplexmlfiles;

import org.testng.annotations.Test;

public class SanityTest {

	@Test(priority=0)
	public void testThree() {
		System.out.println("SanityTest-testThree");
	}
	@Test(priority=1)
	public void testFour() {
		System.out.println("SanityTest-testFour");
	}
}
