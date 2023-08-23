package com.tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		System.out.println("Title is:" + driver.getTitle());
		System.out.println("Text is:" + driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Window handles are:"+windowHandles);
		Iterator<String> iterator = windowHandles.iterator();
		String parentWindow = iterator.next();
		String childWindow = iterator.next();
		driver.switchTo().window(childWindow);
		Thread.sleep(2000);	
		System.out.println("Title is:" + driver.getTitle());
		System.out.println("Text is:" + driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);	
		System.out.println("Title is:" + driver.getTitle());
		System.out.println("Text is:" + driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		driver.quit();

	}

}
