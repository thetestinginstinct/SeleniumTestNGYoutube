package com.testngconcepts;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGSkipExceptionDemo {

	@Test(enabled=false)
	public void loginTest() {
		System.out.println("loginTest");
	}

	@Test
	public void forgotPasswordTest() {

		throw new SkipException("Skipping forgotPasswordTest");
	}

	@Test()
	public void logOutTest() {
		
		boolean isLogOutAvailable=false;
		if(!isLogOutAvailable)
		{
			throw new SkipException("Skipping logOutTest");
		}
		System.out.println("Executed logOutTest");
	}

}
