package runner;

import base.ProjectSpeicificMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/test/java/features/Login.feature", 
glue="stepdefinition" ,publish=true ,tags="@smoke or @dilip")

//"@sanity"
//"not @smoke"
//"@smoke or @dilip"

public class LoginTestNgRunner extends  ProjectSpeicificMethod{

}

