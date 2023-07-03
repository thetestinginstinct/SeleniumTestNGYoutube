package com.tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChangeBrowserScreenSize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
//		Thread.sleep(3000);
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.manage().window().minimize();
//		Thread.sleep(3000);
//		driver.manage().window().fullscreen();
////		Dimension dimension=new Dimension(800,600);
//		Thread.sleep(3000);
//		driver.manage().window().setSize(new Dimension(800,600));
	}

}
