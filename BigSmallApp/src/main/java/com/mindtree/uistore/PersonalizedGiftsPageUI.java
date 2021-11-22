package com.mindtree.uistore;

import org.openqa.selenium.By;

public class PersonalizedGiftsPageUI {
	public By nameplate = By.xpath("(//div[@class='grid-product__title'])[2]");
	public By addtocart = By.xpath("//button[@name='add']");
	public By text = By.xpath("//span[@class='swym-wishlist-cta']");
	public By personalizedgifts = By.xpath("//a[@data-dropdown-rel='personalized-gifts']");
}
