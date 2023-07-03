package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateNewTabAndWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		System.out.println("Title is:"+driver.getTitle());
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.youtube.com/@thetestinginstinct");
		System.out.println("Title is:"+driver.getTitle());

	}

}
