package com.mindtree.uistore;

import org.openqa.selenium.By;

public class NewPageUI {
	public By New = By.xpath("//a[@data-dropdown-rel='new']");
	public By postcards = By.xpath("(//div[@class='grid-product__title'])[1]");
	public By addtocart = By.xpath("(//button[@type='submit'])[2]");
	public By checkout = By.xpath("(//button[@name='checkout'])[1]");
}
