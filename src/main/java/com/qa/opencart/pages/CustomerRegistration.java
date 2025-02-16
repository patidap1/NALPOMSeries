package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.util.ElementUtil;

public class CustomerRegistration {

	private WebDriver driver;
	private ElementUtil eleUtil;

	public CustomerRegistration(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

	// Private By locators
	private By header = By.cssSelector("div#content h1");
	private By firstName = By.id("input-firstname");
	
	
}
