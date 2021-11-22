package com.mindtree.uistore;

import org.openqa.selenium.By;

public class HomePageUI {
	public By sign_in = By.xpath("//i[@class='fa fa-user']");
	public By email = By.id("CustomerEmail");
	public By password = By.id("CustomerPassword");
	public By sign_in_button = By.xpath("(//input[@type='submit'])[1]");
	public By text = By.id("customer_register_link");
	public By search = By.xpath("(//input[@type='search'])[1]");
	public By text1 = By.xpath("(//span[@class='snize-title'])[7]");
	public By createacc = By.xpath("//a[@id='customer_register_link']");
	public By e_mail = By.id("Email");
	public By pw = By.id("CreatePassword");
	public By create = By.xpath("//input[@type='submit']");
	public By text2 = By.xpath("(//button[@class='btn btn-default'])[1]");
}
