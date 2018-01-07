package com.my.POM_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addNewLocate {

	WebDriver driver;

	public addNewLocate(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	@FindBy (xpath = ".//*[text()=\"Admin\"]")
	WebElement clickOnAdmin;
	
	public void adminClick() {
		clickOnAdmin.click();
	}
	
	
}
