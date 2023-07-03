package com.testngconcepts;

import org.testng.annotations.Test;

public class InvocationCount{
	
	@Test(invocationCount = 100)
	public void testOne() {
		System.out.println("testOne");
	}

}
