package com.mindtree.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.uistore.ChristmasGiftsPageUI;
import com.mindtree.utilities.Log;

public class ChristmasGiftsPage extends ChristmasGiftsPageUI {
	public WebDriver driver;
	Log log = new Log();

	public ChristmasGiftsPage(WebDriver driver) {
		this.driver = driver;
	}
	public void wishlit2cart() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(christmas_gifts).click();
		driver.findElement(star_lights).click();
		driver.findElement(addtowishlist).click();
		driver.findElement(view_wishlist).click();
		driver.findElement(accesswishlist).click();
		Thread.sleep(3000);
		driver.findElement(addtocart).click();
		Thread.sleep(3000);
		try {
			Assert.assertTrue(driver.findElement(checkout).isDisplayed());
			log.infoLog("Successfully added to cart");
		} catch (Exception e) {
			log.errorLog("item is not added to the cart");
		}
	}
}
