package com.tests;

import java.io.IOException;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DisableInfobarEdge {

	public static void main(String[] args) throws IOException {
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

		WebDriver driver = new EdgeDriver(edgeOptions);

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

	}
}
