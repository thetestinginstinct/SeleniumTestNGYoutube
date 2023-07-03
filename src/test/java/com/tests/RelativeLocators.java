package com.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.saucedemo.com/");		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");		
		driver.findElement(By.id("login-button")).click();
		By backpack=RelativeLocator.with(By.tagName("div")).above(By.xpath("(//div[@class='inventory_item_desc'])[1]"));
		System.out.println("Product Name is:"+driver.findElement(backpack).getText());
		By tshirt=RelativeLocator.with(By.tagName("div")).below(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		System.out.println("Product Name is:"+driver.findElement(tshirt).getText());
		By price=RelativeLocator.with(By.tagName("div")).toLeftOf(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		System.out.println("Price is:"+driver.findElement(price).getText());
		
		By addToCart=RelativeLocator.with(By.tagName("button")).toRightOf(By.xpath("//div[text()='29.99']"));
		System.out.println("Button is:"+driver.findElement(addToCart).getText());
		By addToCart1=RelativeLocator.with(By.tagName("button")).near(By.xpath("//div[text()='29.99']"));
		System.out.println("Button is:"+driver.findElement(addToCart1).getText());
		By addToCart2=RelativeLocator.with(By.tagName("button")).near(By.xpath("//div[text()='29.99']"))
				.below(By.xpath("(//div[@class='inventory_item_desc'])[1]"));
		System.out.println("Button is:"+driver.findElement(addToCart2).getText());
		driver.close();
	}

}
