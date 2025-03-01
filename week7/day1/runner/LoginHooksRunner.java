package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/test/java/features/Login.feature", 
glue={"stepdefinition","hooks"} ,publish=true)


public class LoginHooksRunner extends AbstractTestNGCucumberTests {

}

//NullPointerException - driver instance its not shared properly
//static keyword -> common reference to all the classes

//DuplicateStepDefinitionException 

//UndefinedStepException