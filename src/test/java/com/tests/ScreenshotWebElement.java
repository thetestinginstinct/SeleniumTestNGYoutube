package com.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenshotWebElement {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		File source = loginButton.getScreenshotAs(OutputType.FILE);
		File destination=new File("./Screenshots/login2.png");
		FileUtils.copyFile(source, destination);

		driver.close();

	}

}
