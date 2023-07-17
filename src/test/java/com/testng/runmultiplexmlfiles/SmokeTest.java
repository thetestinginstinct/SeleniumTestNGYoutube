package com.testng.runmultiplexmlfiles;

import org.testng.annotations.Test;

public class SmokeTest {

	@Test
	public void testOne() {
		System.out.println("SmokeTest-testOne");
	}
	@Test
	public void testTwo() {
		System.out.println("SmokeTest-testTwo");
	}
}
