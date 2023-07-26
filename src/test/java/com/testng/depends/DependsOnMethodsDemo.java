package com.testng.depends;

import org.testng.annotations.Test;

public class DependsOnMethodsDemo {
	@Test
	public void loginTest()
	{
		int a=10/0;
		System.out.println("loginTest");
	}
	@Test
	public void searchProductTest()
	{
		System.out.println("searchProductTest");
	}
	@Test(dependsOnMethods = {"loginTest"})
	public void addToCartTest()
	{
		System.out.println("addToCartTest");
	}
	@Test(dependsOnMethods = {"loginTest"})
	public void paymentTest()
	{
		System.out.println("paymentTest");
	}
	@Test(dependsOnMethods = {"loginTest"})
	public void logoutTest()
	{
		System.out.println("logoutTest");
	}
	@Test(dependsOnMethods = {"loginTest"},alwaysRun = true)
	public void generateReportTest()
	{
		System.out.println("generateReportTest");
	}

}
