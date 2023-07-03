package com.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert confirmAlert=driver.switchTo().alert();
		System.out.println(confirmAlert.getText());
		Thread.sleep(3000);
		confirmAlert.sendKeys("Testing");
		confirmAlert.accept();
		


		
		
		
	}

}
