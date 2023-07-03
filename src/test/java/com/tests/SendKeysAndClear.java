package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysAndClear {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).clear();
		Thread.sleep(2000);
		password.clear();

	}

}
