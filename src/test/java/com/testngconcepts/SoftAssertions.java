package com.testngconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {

	WebDriver driver;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Test
	public void titleAndLoginButtonDisplayTest() {
		String actualTitle=driver.getTitle();
		String expectedTitle="Swagg Labs";
		SoftAssert obj1= new SoftAssert();
		obj1.assertEquals(actualTitle, expectedTitle, "Title does not match");
		obj1.assertEquals(driver.findElement(By.id("login-button")).isDisplayed(), false,"button not displayed");
		obj1.assertAll();
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
