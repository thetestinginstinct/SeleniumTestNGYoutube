package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextAndLinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Abo")).click();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("About")).click();

	}

}
