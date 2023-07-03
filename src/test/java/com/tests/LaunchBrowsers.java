package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowsers {

	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.saucedemo.com/");

	}

}
