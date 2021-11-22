package com.mindtree.uistore;

import org.openqa.selenium.By;

public class SecretSantaGiftsPageUI {
	public By secret_santa_gifts = By.xpath("//a[@data-dropdown-rel='secret-santa-gifts']");
	public By sortby = By.id("sortBy");
	public By text1 = By.xpath("(//div[@class='grid-product__title'])[1]");
}
