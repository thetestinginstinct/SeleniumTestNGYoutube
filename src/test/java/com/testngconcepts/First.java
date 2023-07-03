package com.testngconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class First {
	
	@Test
	public void launchGoogleAndPrintTitleTest()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("Title is:"+driver.getTitle());
		driver.close();
	}
	@Test
	public void launchSwagLabsAndPrintTitleTest()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		System.out.println("Title is:"+driver.getTitle());
		driver.close();
	}

}
