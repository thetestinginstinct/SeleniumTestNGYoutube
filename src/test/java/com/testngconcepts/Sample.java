package com.testngconcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}

}
