package com.tests;

import java.io.IOException;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableInfobarChrome {

	public static void main(String[] args) throws IOException {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

	}
}
