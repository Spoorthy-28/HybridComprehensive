package com.mindtree.pageObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.uistore.HomePageUI;
import com.mindtree.utilities.ExcelReader;
import com.mindtree.utilities.Log;

public class HomePage extends HomePageUI {
	public WebDriver driver;
	Log log = new Log();

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void validateLogin() throws IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(sign_in).click();
		ExcelReader er = new ExcelReader();
		ArrayList<String> list = er.getExcelData();
		driver.findElement(email).sendKeys(list.get(1));
		driver.findElement(password).sendKeys(list.get(2));
		driver.findElement(sign_in_button).click();
		try {
			Assert.assertTrue(driver.findElement(text).isDisplayed());
		}
		catch(Exception e) {
			log.infoLog("Login Unsuccessful");
		}
	}
	public void createAcc() throws IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(sign_in).click();
		driver.findElement(createacc).click();
		driver.findElement(e_mail).sendKeys("fesbuw@gmail.com");
		driver.findElement(pw).sendKeys("d23e09");
		driver.findElement(create).click();
		try{
			Assert.assertTrue(driver.findElement(text2).isDisplayed());
		}
		catch(Exception e) {
			log.infoLog("Account creation is not successful");
		}
	}
	public void getSearchResults() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(search).click();
		driver.findElement(search).sendKeys("vintage travel journal");
		driver.findElement(search).sendKeys(Keys.ENTER);
		Assert.assertTrue(driver.findElement(text1).isDisplayed());
	}

}
