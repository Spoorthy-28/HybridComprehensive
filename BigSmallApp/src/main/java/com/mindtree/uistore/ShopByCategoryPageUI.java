package com.mindtree.uistore;

import org.openqa.selenium.By;

public class ShopByCategoryPageUI {
	public By shopbycategory = By.xpath("//a[@data-dropdown-rel='shop-by-category']");
	public By shopbyperson = By.xpath("(//a[@href='/collections/gifts-by-person'])[2]");
	public By unicorncrazy = By.xpath("(//a[@href='/collections/unicorn-crazy'])[2]");
	public By unicornplushkeychain = By.xpath("(//div[@class='grid-product__title'])[24]");
	public By incqty = By.xpath("//span[@class='js--qty-adjuster js--add']");
	public By addtocart = By.xpath("//button[@name='add']");
	public By text = By.xpath("//div[@class='errors text-center']");
}
