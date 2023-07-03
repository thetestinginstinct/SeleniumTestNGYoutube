package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultiSelectDropdownUsingSelectClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/select-menu");

		Thread.sleep(3000);
		
		Select select= new Select(driver.findElement(By.id("cars")));
		
		select.selectByIndex(0);
		
		Thread.sleep(3000);
		
		select.selectByValue("opel");
		
		Thread.sleep(3000);
		
		select.selectByVisibleText("Audi");
		
		Thread.sleep(3000);
		
		select.deselectAll();
		
//		select.deselectByIndex(0);
//		
//		Thread.sleep(3000);
//		
//		select.deselectByValue("opel");
//		
//		Thread.sleep(3000);
//		
//		select.deselectByVisibleText("Audi");
		
		Thread.sleep(3000);

		driver.close();

	}

}
