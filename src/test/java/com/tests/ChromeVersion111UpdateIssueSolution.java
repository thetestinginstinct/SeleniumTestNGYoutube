package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeVersion111UpdateIssueSolution {

	public static void main(String[] args) {
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		System.out.println("Title is:" + driver.getTitle());

	}

}
