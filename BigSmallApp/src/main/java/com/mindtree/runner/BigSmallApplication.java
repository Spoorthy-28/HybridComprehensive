package com.mindtree.runner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mindtree.pageObject.AllofitPage;
import com.mindtree.pageObject.ChristmasGiftsPage;
import com.mindtree.pageObject.CorporateGiftsPage;
import com.mindtree.pageObject.HomePage;
import com.mindtree.pageObject.NewPage;
import com.mindtree.pageObject.PersonalizedGiftsPage;
import com.mindtree.pageObject.SecretSantaGiftsPage;
import com.mindtree.pageObject.ShopByCategoryPage;
import com.mindtree.resuablecomponents.Base;

public class BigSmallApplication{
	public WebDriver driver;
	Base b = new Base();
	@BeforeMethod
	public void getBrowser() throws IOException {
		driver = b.invokeBrowser();
	}
	@Test(priority=1)
	public void loginValidation() throws IOException {
		HomePage hp = new HomePage(driver);
		hp.validateLogin();
	}
	@Test(priority=2)
	public void validateReverseAlphabeticorderList() {
		SecretSantaGiftsPage sp = new SecretSantaGiftsPage(driver);
		sp.reverseAlphabeticorderList();
	}
	@Test(priority=4)
	public void validateCOD() throws InterruptedException {
		AllofitPage ap = new AllofitPage(driver);
		ap.getCOD();
	}
	@Test(priority=3)
	public void wishlistToCart() throws InterruptedException {
		ChristmasGiftsPage cp = new ChristmasGiftsPage(driver);
		cp.wishlit2cart();
	}
	@Test(priority=5)
	public void validateExceededOrderQty() throws InterruptedException {
		ShopByCategoryPage scp = new ShopByCategoryPage(driver);
		scp.exceededOrderQuantity();
	}
	@Test(priority=6)
	public void ValidateSearchResults() {
		HomePage hp = new HomePage(driver);
		hp.getSearchResults();
	}
	@Test(priority=7)
	public void createAccValidation() throws IOException {
		HomePage hp = new HomePage(driver);
		hp.createAcc();
	}
	@Test(priority=8)
	public void AddToCartValidation() throws InterruptedException {
		NewPage np = new NewPage(driver);
		np.add2cart();
	}
	@Test(priority=9)
	public void PersonalizedGifts() throws IOException {
		PersonalizedGiftsPage pgp = new PersonalizedGiftsPage(driver);
		pgp.getPersonalizedNamePlate();
	}
	@Test(priority=10)
	public void CorporateGifts() throws IOException, InterruptedException {
		CorporateGiftsPage cp = new CorporateGiftsPage(driver);
		cp.getCorporategifts();
	}
	
	@AfterMethod
	public void closeDriver() {
		driver.close();
	}
}
