package com.mindtree.uistore;

import org.openqa.selenium.By;

public class CorporateGiftsPageUI {
	public By corporategifts = By.xpath("//a[@data-dropdown-rel='corporate-gifts']");
	public By name = By.id("contactFormName");
	public By email = By.id("contactFormEmail");
	public By phone = By.id("contactFormPhone");
	public By message = By.id("contactFormMessage");
	public By submit = By.xpath("//input[@type='submit']");
	public By text2 = By.xpath("//p[@class='note form-success']");
	
}
