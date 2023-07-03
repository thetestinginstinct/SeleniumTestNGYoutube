package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void invalidLoginTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("login-button")).click();
		String errorMsg=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		System.out.println("errorMsg is:"+errorMsg);
		
	}
	@Test
	public void loginButtonTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.saucedemo.com/");
		System.out.println("Button displayed:"+driver.findElement(By.id("login-button")).isDisplayed());
		
	}
	@Test
	public void swaglabsHeadingTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		System.out.println("Heading text is:"+driver.findElement(By.xpath("//div[@class='app_logo']")).getText());
		
	}
	@Test
	public void productsHeadingTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		System.out.println("Heading text is:"+driver.findElement(By.xpath("//span[@class='title']")).getText());
		
	}
}
