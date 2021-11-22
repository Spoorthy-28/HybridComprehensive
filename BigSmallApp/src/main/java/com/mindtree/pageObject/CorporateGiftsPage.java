package com.mindtree.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.uistore.AllofitPageUI;
import com.mindtree.uistore.CorporateGiftsPageUI;
import com.mindtree.utilities.Log;

public class CorporateGiftsPage extends CorporateGiftsPageUI {
	public WebDriver driver;
	Log log = new Log();

	public CorporateGiftsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void getCorporategifts() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(corporategifts).click();
		driver.findElement(name).sendKeys("dsavyufv");
		driver.findElement(email).sendKeys("nifuds@gmail.com");
		driver.findElement(phone).sendKeys("9151861980");
		driver.findElement(message).sendKeys("bfu wew uwbcwb mi");
		driver.findElement(submit).click();
		Thread.sleep(3000);
		try {
			Assert.assertTrue(driver.findElement(text2).isDisplayed());
			log.infoLog("Thank You for contacting us!");
		}catch(Exception e) {
			log.infoLog("Error occured in contacting us");
		}
	}
	
}
