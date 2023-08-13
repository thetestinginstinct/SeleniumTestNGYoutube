package com.testng.timeout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGTimeoutDemo {

	@Test(timeOut = 10000)
	public void googleLoadingTest() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}

	@Test(timeOut = 10000)
	public void swagLabsLoadingTest() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
