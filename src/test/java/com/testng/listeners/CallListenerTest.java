package com.testng.listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class CallListenerTest {

	@Test
	public void testA()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void testB()
	{
		Assert.assertTrue(false);
	}
	
	@Test
	public void testC()
	{
		throw new SkipException("testC will be skipped");
	}
}
