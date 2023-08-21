package com.tests;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleDigestAuthentication {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		// 1st way - works for chrome, firefox and edge. This will work for basic and digest auth.
		 
//		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
 

		// 2nd way- only works for chrome and edge. This will work for basic and digest auth.
		
		((HasAuthentication)driver).register(UsernameAndPassword.of("admin", "admin"));
		driver.get("https://the-internet.herokuapp.com/digest_auth");
       Thread.sleep(2000);
       driver.close();
		
		}

}
