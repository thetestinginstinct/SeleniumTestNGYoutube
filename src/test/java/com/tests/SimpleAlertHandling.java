package com.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert simpleAlert=driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		


		
		
		
	}

}
