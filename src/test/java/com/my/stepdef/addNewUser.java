package com.my.stepdef;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.my.POM_Factory.addNewLocate;
import com.my.POM_Factory.logInLocate;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addNewUser {

	static WebDriver driver;

	@Given("^Access to the Dash-Board$")
	public void access_to_the_Dash_Board() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\ChromeWebdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Properties prop = new Properties();

		FileInputStream pointFile = new FileInputStream(
				"C:\\Users\\alams\\Project\\src\\test\\java\\com\\my\\DataDriven\\credentials.properties");

		prop.load(pointFile);
		
		driver.get(prop.getProperty("url"));

		// creating object for class - logIn; to invoke method
		logInLocate orhm = new logInLocate(driver);
		orhm.enterUserName().clear();
		orhm.enterUserName().sendKeys(prop.getProperty("userName"));
		orhm.enterUserPassword().clear();
		orhm.enterUserPassword().sendKeys(prop.getProperty("password"));
		
		orhm.clickLoginButton().click();
	
	}

	@When("^click on the Admin$")
	public void click_on_the_Admin() throws Throwable {
		
		
		addNewLocate addUser = new addNewLocate(driver);
		
		
	}

	@And("^click on User Management$")
	public void click_on_User_Management() throws Throwable {

	}

	@And("^click on Users$")
	public void click_on_Users() throws Throwable {

	}

	@And("^click on the Green Plus sign$")
	public void click_on_the_Green_Plus_sign() throws Throwable {

	}

	@And("^Enters Employee Name,$")
	public void enters_Employee_Name() throws Throwable {

	}

	@And("^Enters Username,$")
	public void enters_Username() throws Throwable {

	}

	@And("^Enters ESS Role,$")
	public void enters_ESS_Role() throws Throwable {

	}

	@And("^Selects Supervisor Role,$")
	public void selects_Supervisor_Role() throws Throwable {

	}

	@And("^Selects Admin Role,$")
	public void selects_Admin_Role() throws Throwable {

	}

	@And("^Selects Status$")
	public void selects_Status() throws Throwable {

	}

	@And("^Enters Password,$")
	public void enters_Password() throws Throwable {

	}

	@And("^Enters Re-types the Password$")
	public void enters_Re_types_the_Password() throws Throwable {

	}

	@And("^Clicks on Save$")
	public void clicks_on_Save() throws Throwable {

	}

	@Then("^Admin sucessfully adds a  New Site User\\.$")
	public void admin_sucessfully_adds_a_New_Site_User() throws Throwable {

	}
}
