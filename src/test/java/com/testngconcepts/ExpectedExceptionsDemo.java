package com.testngconcepts;

import org.testng.annotations.Test;

public class ExpectedExceptionsDemo {

	@Test
	public void testA() {
		int a = 10 / 0;
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void testB() {
		int a = 10 / 0;
	}
	
	@Test(expectedExceptions={NullPointerException.class },expectedExceptionsMessageRegExp ="This is null pointer exceptions")
	public void testC() {
		throw new NullPointerException("This is null pointer exception");
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
