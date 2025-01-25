package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//mismatch attribute name or value - NoSuchElementException
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//return type for findElement -> WebElement
		/*
		 * WebElement passWord = driver.findElement(By.id("password"));
		 * passWord.sendKeys("crmsfa");
		 */
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
	//	driver.findElement(By.partialLinkText("CRM/S")).click();
		
		//print title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		//System.out.println(driver.getTitle());
		
		
		
		
		
	}

}
