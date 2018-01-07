package com.my.POM_Factory;

/*
 * THIS CLASS GOING TP HAVE A CONSTRUCTOR 
 * ALL THE LOCATING ELEMENTS FOR LOG-IN 
 * AND PASSWORD
 * ITS METHODS 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class logInLocate {

	WebDriver driver;

	// CONSTRUCTOR
	public logInLocate (WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}// End of CONSTRUCTOR


	@FindBy(how = How.XPATH, using = "//INPUT[@id='txtUsername']")
	WebElement userName;
	
	public WebElement enterUserName() {
		return userName;
	}
	

	@FindBy(how = How.XPATH, using = "//INPUT[@id='txtPassword']")
	WebElement userPassword;
	
	public WebElement enterUserPassword() {
		return userPassword;
	}
	
	
	
	
	@FindBy(how = How.XPATH, using = "//INPUT[@id='btnLogin']")
	WebElement userClickLoginButton;
	
	public WebElement clickLoginButton() {
		return userClickLoginButton;
	}
}

