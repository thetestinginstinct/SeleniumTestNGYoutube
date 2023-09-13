package com.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/upload");
		// Upload a file from file system
//		driver.findElement(By.id("file-upload")).sendKeys("C:\\Youtube\\Uploads\\T.png");
 
		// Upload a file stored inside a folder of the project
		driver.findElement(By.id("file-upload")).
		sendKeys(System.getProperty("user.dir")+"/Uploads/T.png");

	}

}
