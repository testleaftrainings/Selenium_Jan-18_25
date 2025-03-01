package stepdefinition;

import org.openqa.selenium.By;

import base.ProjectSpeicificMethod;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends ProjectSpeicificMethod {

	//LoginSteps extends HooksImplementation
	/*
	 * public ChromeDriver driver;
	 * 
	 * @Given("Launch the Browser and Load the url") public void
	 * launch_the_browser_and_load_the_url() { driver=new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.get("http://leaftaps.com/opentaps/");
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); }
	 */
	
	
	@When("Enter the username as {string}")
	public void enter_the_username_as_demosalesmanager(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);

	}
	@When("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String passWd) {
		driver.findElement(By.id("password")).sendKeys(passWd);

	}
	@When("Click on LoginButton")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("Verify Login is Successful")
	public void verify_login_is_successful() {
String title = driver.getTitle();

if(title.contains("Leaftaps")) {
	System.out.println("Login is Successful");
}else {
	System.out.println("Login is not Successful");
}
	}

@But("Verify Login is not Successful")
public void verify_login_is_not_successful() {
String title = driver.getTitle();

if(title.contains("Leaftaps")) {
System.out.println("Login is not Successful");
}else {
System.out.println("Login is Successful");
}

	}


}
