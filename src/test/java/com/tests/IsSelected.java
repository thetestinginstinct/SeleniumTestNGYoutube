package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/radio");
		driver.manage().window().maximize();
		boolean value=driver.findElement(By.id("notfoo")).isSelected();
		System.out.println("Button selected?:"+value);//Button selected?:true
		

	}

}
