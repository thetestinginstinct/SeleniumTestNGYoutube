package com.tests;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DisableImagesInBrowsers {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

//		disableImagesChrome();
//		disableImagesEdge();
		disableImagesFirefox();
		Thread.sleep(2000);
//		driver.close();
		}

		public static void disableImagesChrome() {

		ChromeOptions chromeOptions = new ChromeOptions();
//		 1st method
//		 chromeOptions.addArguments("--blink-settings=imagesEnabled=false");
//		 2nd method
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.managed_default_content_settings.images", 2);
		chromeOptions.setExperimentalOption("prefs", prefs);
		driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		}

		public static void disableImagesEdge() {

		EdgeOptions edgeOptions = new EdgeOptions();
//		 1st method
//		 edgeOptions.addArguments("--blink-settings=imagesEnabled=false");
//		 2nd method
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.managed_default_content_settings.images", 2);
		edgeOptions.setExperimentalOption("prefs", prefs);
		driver=new EdgeDriver(edgeOptions);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		}

		public static void disableImagesFirefox() {

		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.addPreference("permissions.default.image", 2);
		driver=new FirefoxDriver(firefoxOptions);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		}
}
