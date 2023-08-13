package com.testngconcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IgnoreMissingDependenciesDemo {
	
	@Test(enabled= true)
	public void testOne()
	{
		System.out.println("testOne");
		Assert.fail();
	
	}

	@Test(dependsOnMethods= {"testOne"},ignoreMissingDependencies = true)
	public void testTwo()
	{
	System.out.println("testTwo");
	}

}
