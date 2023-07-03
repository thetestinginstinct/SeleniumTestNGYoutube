package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAndTagNameLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("gLFyf")).sendKeys("The Testing Instinct");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		driver.findElement(By.tagName("input")).sendKeys("Selenium");
		
		
		

	}

}
