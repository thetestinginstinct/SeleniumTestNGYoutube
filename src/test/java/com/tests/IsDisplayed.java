package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		boolean value=driver.findElement(By.id("login-button")).isDisplayed();
		System.out.println("Button displayed?:"+value);//Button displayed?:true
	}

}
