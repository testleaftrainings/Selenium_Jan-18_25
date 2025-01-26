package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement dd = driver.findElement(By.className("ui-selectonemenu"));
		
		//create object for Select Class
		
		Select options=new Select(dd);
		
		//call the methods
		//options.selectByIndex(3);
		//options.selectByValue(null);
		options.selectByVisibleText("Selenium");
		
		//way 2 - Non select tag -handle that as normal element using click() 
		
		driver.findElement(By.id("j_idt87:country_label")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("j_idt87:country_3")).click();
		
		
		
		
	}

}
