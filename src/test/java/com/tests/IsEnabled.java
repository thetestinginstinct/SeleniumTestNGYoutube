package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		driver.manage().window().maximize();
		boolean value=driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println("Button enabled?"+value);//Button enabled?:false
		

	}

}
