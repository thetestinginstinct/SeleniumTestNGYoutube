package com.testngconcepts;

import org.testng.annotations.Test;

public class Description {
	
	@Test(description = "This method prints testOne in console")
	public void testOne() {
		System.out.println("testOne");
	}
	@Test(description = "This method prints testTwo in console")
	public void testTwo() {
		System.out.println("testTwo");
	}

}
