package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CloseAndQuitBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.youtube.com/@thetestinginstinct");
		driver.quit();


	}

}
