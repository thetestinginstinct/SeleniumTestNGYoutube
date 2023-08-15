package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HandleSSLCertificateError {
	static WebDriver driver;

	public static void main(String[] args) {

//		handleSSLErrorInChrome();
//		handleSSLErrorInFirefox();
		handleSSLErrorInEdge();
		driver.manage().window().maximize();
		driver.get("https://self-signed.badssl.com/");
		

	}

	public static void handleSSLErrorInChrome() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setAcceptInsecureCerts(true);
		driver = new ChromeDriver(chromeOptions);
	}
	public static void handleSSLErrorInFirefox() {
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setAcceptInsecureCerts(true);
		driver = new FirefoxDriver(firefoxOptions);
	}
	public static void handleSSLErrorInEdge() {
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.setAcceptInsecureCerts(true);
		driver = new EdgeDriver(edgeOptions);
	}

}
