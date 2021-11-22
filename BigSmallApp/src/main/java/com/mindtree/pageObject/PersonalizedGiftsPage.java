package com.mindtree.pageObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.uistore.PersonalizedGiftsPageUI;
import com.mindtree.utilities.ExcelReader;
import com.mindtree.utilities.Log;

public class PersonalizedGiftsPage extends PersonalizedGiftsPageUI {
	public WebDriver driver;
	Log log = new Log();

	public PersonalizedGiftsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void getPersonalizedNamePlate() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(personalizedgifts).click();
		driver.findElement(nameplate).click();
		driver.findElement(addtocart).click();
		driver.findElement(text).isDisplayed();
	}
}
