package com.tests;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenshotFullPageChromeAndEdge {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		Screenshot myScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100))
				.takeScreenshot(driver);
		ImageIO.write(myScreenshot.getImage(), "PNG", new File("./Screenshots/amazonedge.png"));

		driver.close();
	}
}
