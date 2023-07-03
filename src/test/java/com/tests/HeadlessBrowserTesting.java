package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessBrowserTesting {

	static WebDriver driver;
	public static void main(String[] args) {
		HeadlessBrowserTesting headless=new HeadlessBrowserTesting();
		headless.headlessChrome();
//		headless.headlessFirefox();
//		headless.headlessEdge();
		driver.get("https://www.saucedemo.com/");
		System.out.println("Title is:"+driver.getTitle());
		System.out.println("Url is:"+driver.getCurrentUrl());
	}

	public void headlessChrome()
	{
		ChromeOptions chromeOptions= new ChromeOptions();
		// not recommended method as this is deprecated in selenium 4.8.0 +
		//chromeOptions.setHeadless(true);
//		chromeOptions.addArguments("--headless=new");
//	    chromeOptions.addArguments("--headless=chrome");
//		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--headless","--log-level=0");
		driver=new ChromeDriver(chromeOptions);
	}
	public void headlessFirefox()
	{
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"true");
		FirefoxOptions firefoxOptions=new FirefoxOptions();
		firefoxOptions.addArguments("--headless");
		driver=new FirefoxDriver(firefoxOptions);
	}
	public void headlessEdge()
	{
		EdgeOptions edgeOptions=new EdgeOptions();
		edgeOptions.addArguments("--headless");
		driver=new EdgeDriver(edgeOptions);
	}
}
