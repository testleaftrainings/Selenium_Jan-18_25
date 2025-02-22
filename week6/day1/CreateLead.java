package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends ProjectSpecificMethod{
	
	@DataProvider(name="setValue")
	public String[][] fetchData(){
		
		String[][] data=new String[2][3];
		
		data[0][0]="Qeagle";
		data[0][1]="Dilip";
		data[0][2]="Kumar";
		
		data[1][0]="Testleaf";
		data[1][1]="Dilip";
		data[1][2]="Kumar";
		
		return data;
	}
	

	@Test(dataProvider = "setValue")
	public  void runCreateLead(String cName,String fName,String lName) {
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		
}
}






