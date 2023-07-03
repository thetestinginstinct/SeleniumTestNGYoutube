package com.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		String textValue=driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText();
		System.out.println("Text value is:"+textValue);
		

	}

}
