package com.mindtree.resuablecomponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {
	public static WebDriver driver;
	public Properties prop;

	public WebDriver invokeBrowser() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Spoorthy\\eclipse-workspace\\BigSmallApp\\testdata\\configurations.properties");
		prop = new Properties();
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Spoorthy\\eclipse-workspace\\BigSmallApp\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(prop.getProperty("url"));
		return driver;
	}

	public void getScreenshots(String name) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Spoorthy\\eclipse-workspace\\BigSmallApp\\Screenshots\\" + name
				+ System.currentTimeMillis() + "screenshot.png"));
	}
}
