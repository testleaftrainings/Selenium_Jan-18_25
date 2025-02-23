package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/test/java/features/Login.feature", 
glue="stepdefinition" ,publish=true)

//publish =true -> basic report for cucumber
public class LoginRunner extends AbstractTestNGCucumberTests {

}
