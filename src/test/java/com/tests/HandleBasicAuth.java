package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleBasicAuth {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		


	}

}
