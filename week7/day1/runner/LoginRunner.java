package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/test/java/features/CreateLead.feature", 
glue="stepdefinition" ,publish=true)


public class LoginRunner extends AbstractTestNGCucumberTests {

}

//DuplicateStepDefinitionException 

//UndefinedStepException