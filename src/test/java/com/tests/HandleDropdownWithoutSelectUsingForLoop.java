package com.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropdownWithoutSelectUsingForLoop {

	public static void main(String[] args) throws InterruptedException  {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_1");
		driver.findElement(By.id("btnDropdownDemo")).click();
		List<WebElement> dropDownOptions = driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a"));
		for(int i=0;i<dropDownOptions.size();i++)
		{
			System.out.println(dropDownOptions.get(i).getText());
			if(dropDownOptions.get(i).getText().contains("HTML")) {
				dropDownOptions.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.close();

	}
}
