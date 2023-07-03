package com.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/dynamic_controls");

		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		
//		WebElement textMessage=driver.findElement(By.id("message"));
		
		WebElement textMessage=new WebDriverWait(driver, Duration.ofSeconds(15)).
		
		until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
		
  


		System.out.println("Text message is:"+textMessage.getText());

		driver.close();

	}

}
