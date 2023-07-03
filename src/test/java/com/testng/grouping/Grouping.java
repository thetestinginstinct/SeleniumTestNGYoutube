package com.testng.grouping;

import org.testng.annotations.Test;

@Test(groups = {"AllTests" })
public class Grouping {

	@Test(groups = { "smoke", "regression" })
	public void test1() {
		System.out.println("test1");
	}

	@Test(groups = { "windows.smoke" })
	public void test2() {
		System.out.println("test2");
	}

	@Test(groups={"smoke","sanity"})
	public void test3() {
		System.out.println("test3");
	}

	@Test(groups={"smoke"})
	public void test4() {
		System.out.println("test4");
	}

	@Test(groups = { "windows.regression" })
	public void test5() {
		System.out.println("test5");
	}

	@Test
	public void test6() {
		System.out.println("test6");
	}
}
