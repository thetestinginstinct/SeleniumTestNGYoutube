package com.testng.dataproviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(dataProvider = "loginData1",dataProviderClass = com.testng.dataproviders.DataProviders.class)
	public void loginTest(String username,String password) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
		driver.close();
	}

	
}
