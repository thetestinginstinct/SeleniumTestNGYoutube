package com.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleNestedFrameDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		System.out.println(driver.findElement(By.tagName("body")).getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.tagName("body")).getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-right']")));
		System.out.println(driver.findElement(By.tagName("body")).getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		System.out.println(driver.findElement(By.tagName("body")).getText());
		driver.close();
		

	}

}
