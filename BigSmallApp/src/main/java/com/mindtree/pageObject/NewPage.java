package com.mindtree.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.uistore.ChristmasGiftsPageUI;
import com.mindtree.uistore.NewPageUI;
import com.mindtree.utilities.Log;

public class NewPage extends NewPageUI {
	public WebDriver driver;
	Log log = new Log();

	public NewPage(WebDriver driver) {
		this.driver = driver;
	}
	public void add2cart() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(New).click();
		driver.findElement(postcards).click();
		driver.findElement(addtocart).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(checkout).isDisplayed());
	}
}
