package com.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotFullPage {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		
		File source=(( FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		File destination=new File("./Screenshots/amazon.png");
		FileUtils.copyFile(source, destination);

		driver.close();
	}
}
