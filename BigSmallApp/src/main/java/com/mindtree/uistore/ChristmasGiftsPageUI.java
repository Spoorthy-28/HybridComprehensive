package com.mindtree.uistore;

import org.openqa.selenium.By;

public class ChristmasGiftsPageUI {
	public By christmas_gifts = By.xpath("//a[@data-dropdown-rel='christmas-gifts']");
	public By star_lights = By.xpath("(//div[@class='grid-product__title'])[4]");
	public By addtowishlist = By.xpath("//span[@class='swym-wishlist-cta']");
	public By view_wishlist = By.xpath("(//i[@class='fa fa-heart'])[2]");
	public By accesswishlist = By.xpath("//button[@id='swym-welcome-button']");
	public By addtocart = By.xpath("(//a[@href='#'])[12]");
	public By checkout = By.xpath("(//button[@name='checkout'])[1]");
}
