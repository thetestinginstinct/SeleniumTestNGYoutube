package com.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/dynamic_controls");

		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		
//		WebElement textMessage=driver.findElement(By.id("message"));
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofMillis(250))
				  .ignoring(NoSuchElementException.class);

WebElement textMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
		
		System.out.println("Text message is:"+textMessage.getText());

		driver.close();

	}

}
