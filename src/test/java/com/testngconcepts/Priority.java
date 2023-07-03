package com.testngconcepts;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = 1)
	public void testOne() {
		System.out.println("testOne");
	}
	@Test
	public void testTwo() {
		System.out.println("testTwo");
	}


}
