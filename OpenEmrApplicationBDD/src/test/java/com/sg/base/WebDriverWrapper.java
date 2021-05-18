package com.sg.base;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;

public class WebDriverWrapper {
	public static WebDriver driver;
	
	
	
	@After
	public void end()
	{
		WebDriverWrapper.driver.quit();
	}

}
