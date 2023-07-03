package com.tests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PrintOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PrintWebPageToPdf {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/");
		
		Pdf pdf=((RemoteWebDriver) driver).print(new PrintOptions());
		
		Path printPage = Paths.get("./Screenshots/chrome3.pdf");
		
		Files.write(printPage,OutputType.BYTES.convertFromBase64Png(pdf.getContent()));
		
		driver.close();

	}

}
