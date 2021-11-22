package com.mindtree.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.mindtree.uistore.SecretSantaGiftsPageUI;
import com.mindtree.utilities.Log;

public class SecretSantaGiftsPage extends SecretSantaGiftsPageUI {
	public WebDriver driver;
	Log log = new Log();

	public SecretSantaGiftsPage(WebDriver driver) {
		this.driver = driver;
	}
	public void reverseAlphabeticorderList() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(secret_santa_gifts).click();
		Select s = new Select(driver.findElement(sortby));
		s.selectByIndex(4);
		Assert.assertEquals(driver.findElement(text1).getText(), "Zodiac Sign Diaries");
	}
}
