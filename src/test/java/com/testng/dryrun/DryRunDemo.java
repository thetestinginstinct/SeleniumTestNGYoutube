package com.testng.dryrun;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DryRunDemo {

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@Test
	public void testOne() {
		System.out.println("testOne");
	}

	@Test
	public void testTwo() {
		System.out.println("testTwo");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}
}
