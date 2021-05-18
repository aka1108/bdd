package com.sg.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sg.base.WebDriverWrapper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PatientStepDefinitions {
	
	@When("I mouseover on patient-client")
	public void i_mouseover_on_patient_client() {		
		Actions action=new Actions(WebDriverWrapper.driver);
		action.moveToElement(
				WebDriverWrapper.driver.findElement(By.xpath("//*[text()='Patient/Client']")
						)).perform();
	}

	@When("I click on patients")
	public void i_click_on_patients() {
		WebDriverWrapper.driver.findElement(By.xpath("//*[text()='Patients']")).click();
	}

	@When("I click on add new patient")
	public void i_click_on_add_new_patient() {
		WebDriverWrapper.driver.switchTo().frame("fin");
		WebDriverWrapper.driver.findElement(By.id("create_patient_btn1")).click();
		WebDriverWrapper.driver.switchTo().defaultContent();
	}

}
