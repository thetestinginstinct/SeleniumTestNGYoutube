package com.testng.enabled;

import org.testng.annotations.Test;

public class Demo2 {

	// Just assume this class has logout related test cases
	@Test(enabled = false)
	public void test5() {
		System.out.println("test5");
	}

	@Test
	public void test6() {
		System.out.println("test6");
	}

	@Test
	public void test7() {
		System.out.println("test7");
	}

	@Test()
	public void test8() {
		System.out.println("test8");
	}

}
