package com.sg.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/Feature/Login.feature"
				,"src/test/resources/Feature/Patient.feature"},
		glue = {"com.sg.stepdefinitions","com.sg.base"},
		publish = true //it will show the report link on console ,publish will give cloud link
		,monochrome = true //unwanted info wont show in console
		//,dryRun = true  //it will run only the logic
		,tags = "@patient" //watever mentioned in tag, that will be run.
//		,tags="@invalid or @valid"
//		,tags="@invalid and @lowpriority"
		,plugin = {"html:report/index.html"}		
		)

@RunWith(Cucumber.class)
public class RunnerTest {

}
