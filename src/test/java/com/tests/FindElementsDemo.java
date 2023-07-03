package com.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		List<WebElement> amazonLinks = driver.findElements(By.tagName("abc"));
		int length=amazonLinks.size();
		System.out.println("Size is:"+length);
		for(int i=0;i<=length-1;i++)
		{
			System.out.println(amazonLinks.get(i).getText());
		}



	}

}
