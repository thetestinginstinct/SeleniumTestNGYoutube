package com.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumSelectClassMethodsAndUses {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/select-menu");

		Thread.sleep(3000);

		Select selectMulti = new Select(driver.findElement(By.id("cars")));

		Select selectSingle = new Select(driver.findElement(By.id("oldSelectMenu")));
		
		System.out.println("Is multiselect dropdown?:"+selectMulti.isMultiple());
		
		System.out.println("Is multiselect dropdown?:"+selectSingle.isMultiple());
		
		List<WebElement> selectMultiOptions = selectMulti.getOptions();
		int length = selectMultiOptions.size();
		System.out.println("Length is:"+length);
		System.out.println("Avaialble options in dropdown:");
		for(int i=0;i<=length-1;i++)
		{
			System.out.println(selectMultiOptions.get(i).getText());
		}

		selectMulti.selectByIndex(0);
		
		Thread.sleep(3000);
		
		selectMulti.selectByValue("opel");
		
		Thread.sleep(3000);
		
		selectMulti.selectByVisibleText("Audi");
		
		List<WebElement> selectedMultiOptions = selectMulti.getAllSelectedOptions();
		int lengthNew=selectedMultiOptions.size();
		System.out.println("Length is:"+lengthNew);
		System.out.println("Selected options in dropdown:");
		for(int i=0;i<=lengthNew-1;i++)
		{
			System.out.println(selectedMultiOptions.get(i).getText());
		}
		System.out.println("First selected option is:"+selectMulti.getFirstSelectedOption().getText());
		
		driver.close();

	}

}
