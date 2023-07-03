package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTitleAndUrl {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
//		String titleValue = driver.getTitle();
		System.out.println("Title is:"+driver.getTitle());
		System.out.println("Url is:"+driver.getCurrentUrl());

	}

}
