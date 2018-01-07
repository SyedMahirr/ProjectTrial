package com.my.stepdef;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.my.POM_Factory.logInLocate;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logIn {

	static WebDriver driver;

	@Given("^Log In Site URL$")
	public void log_In_Site_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\ChromeWebdriver\\chromedriver.exe");
		driver = new ChromeDriver();

		Properties prop = new Properties();

		// tell java where is the file is
		FileInputStream pointFile = new FileInputStream(
				"C:\\Users\\alams\\Project\\src\\test\\java\\com\\my\\DataDriven\\credentials.properties");

		prop.load(pointFile);

		driver.get(prop.getProperty("url"));

	}

	@When("^Enters Valid Username$")
	public void enters_Valid_Username() throws Throwable {
		// creating object for class - logIn; to invoke method
		logInLocate orhm = new logInLocate(driver);
		

		Properties prop = new Properties();

		// tell java where is the file is
		FileInputStream pointFile = new FileInputStream(
				"C:\\Users\\alams\\Project\\src\\test\\java\\com\\my\\DataDriven\\credentials.properties");

		prop.load(pointFile);
		
		orhm.enterUserName().clear();

		orhm.enterUserName().sendKeys(prop.getProperty("userName"));
		
		
		
	}

	@And("^Enter Password$")
	public void enter_Password() throws Throwable {
		// creating object for class - logIn; to invoke method
				logInLocate orhm = new logInLocate(driver);
				

				Properties prop = new Properties();

				// tell java where is the file is
				FileInputStream pointFile = new FileInputStream(
						"C:\\Users\\alams\\Project\\src\\test\\java\\com\\my\\DataDriven\\credentials.properties");

				prop.load(pointFile);
				
				orhm.enterUserPassword().clear();

				orhm.enterUserPassword().sendKeys(prop.getProperty("password"));
	}

	@And("^Clicks the Log-in Button$")
	public void clicks_the_Log_in_Button() throws Throwable {
		logInLocate orhm = new logInLocate(driver);
		
		orhm.clickLoginButton().click();
		

	}

	@Then("^views the Dashboard\\.$")
	public void views_the_Dashboard() throws Throwable {

	}
}
