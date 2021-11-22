package com.mindtree.uistore;

import org.openqa.selenium.By;

public class AllofitPageUI {
	public By allofit = By.xpath("(//a[@href='/collections/allofit'])[2]");
	public By christmas_mug = By.xpath("(//div[@class='grid-product__title'])[3]");
	public By cod = By.id("PostalCode");
	public By check = By.xpath("//button[@onclick='checkCodAvailability()']");
	public By text2 = By.id("Postaldeliverdate");
}
