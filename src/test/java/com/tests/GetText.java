package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String heading=driver.findElement(By.xpath("//div[@class='login_logo']")).getText();
		System.out.println("Heading is:"+heading);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		System.out.println("Error message is:"+driver.findElement(By.xpath("//h3[@data-test='error']"))
		.getText());
		driver.close();
		
		

	}

}
