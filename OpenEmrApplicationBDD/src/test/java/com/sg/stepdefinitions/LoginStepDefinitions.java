package com.sg.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.sg.base.WebDriverWrapper;
import com.sg.pages.DashboardPage;
import com.sg.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinitions {
	
	@Given("I have browser with OpenEMR page")
	public void i_have_browser_with_open_emr_page() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.iedriver().setup();

		WebDriverWrapper.driver=new ChromeDriver();
		WebDriverWrapper.driver.manage().window().maximize();
		WebDriverWrapper.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWrapper.driver.get("https://demo.openemr.io/b/openemr");
	}
	
	@When("I enter username as {string}")
	public void i_enter_username_as(String username) 
	{
		LoginPage.enterUsername(username);
	}
	
	@When("I enter password as {string}")
	public void i_enter_password_as(String password) 
	{
		LoginPage.enterPassword(password);
	}
	
	@When("I select language as {string}")
	public void i_select_language_as(String language) 
	{
		LoginPage.selectLanguageByText(language);
	}
	
	@When("I click on login")
	public void i_click_on_login() 
	{
		LoginPage.clickOnLogin();
	}
	
	@Then("I should get access to the dashboard with title {string}")
	public void i_should_get_access_to_the_dashboard_with_title(String expectedValue) 
	{
		 Assert.assertEquals(expectedValue, DashboardPage.getCurrentTitle());
	}
	
	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String expectedValue) {
	   
		//assert the error message
		 Assert.assertEquals(expectedValue, 
				 WebDriverWrapper.driver.findElement
				 (By.xpath("//*[contains(text(),'Invalid')]")).getText().trim());
	}
	
	
}




