package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserIncognitoMode {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BrowserIncognitoMode incognito=new BrowserIncognitoMode();
//		incognito.incognitoChrome();
//		incognito.incognitoFirefox();
		incognito.incognitoEdge();
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("Title is:"+driver.getTitle());
		System.out.println("Url is:"+driver.getCurrentUrl());
	}

	public void incognitoChrome()
	{
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.addArguments("--incognito");
		driver=new ChromeDriver(chromeOptions);
	}
	public void incognitoFirefox()
	{
		FirefoxOptions firefoxOptions=new FirefoxOptions();
		firefoxOptions.addArguments("-private");
		driver=new FirefoxDriver(firefoxOptions);
	}
	public void incognitoEdge()
	{
		EdgeOptions edgeOptions=new EdgeOptions();
		edgeOptions.addArguments("InPrivate");
		driver=new EdgeDriver(edgeOptions);
	}
}
