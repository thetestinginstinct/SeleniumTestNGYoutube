package com.testng.depends;

import org.testng.annotations.Test;

public class DependsOnGroupsDemo {
	@Test(groups="login")
	public void loginTest()
	{
		int a=10/0;
	System.out.println("loginTest");
	}
	@Test(groups="search")
	public void searchProductTest()
	{
	System.out.println("searchProductTest");
	}
	@Test(groups="addToCart",dependsOnGroups = "login")
	public void addToCartTest()
	{
	System.out.println("addToCartTest");
	}
	@Test(groups="payment",dependsOnGroups = "login")
	public void paymentTest()
	{
	System.out.println("paymentTest");
	}
	@Test(groups="logout",dependsOnGroups = "login")
	public void logoutTest()
	{
	System.out.println("logoutTest");
	}
	@Test(dependsOnGroups = "login",alwaysRun = true)
	public void generateReportTest()
	{
	System.out.println("generateReportTest");
	}
}
