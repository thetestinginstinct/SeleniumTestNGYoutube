package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationMethods {

	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/");
		System.out.println("Title is:"+driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().to("https://www.saucedemo.com/");
		System.out.println("Title is:"+driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("Title is:"+driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().forward();
		System.out.println("Title is:"+driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();

	}

}
