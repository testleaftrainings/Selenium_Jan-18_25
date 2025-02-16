package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnActionsClass {

	public static void main(String[] args) {

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--incognito");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		WebElement mouseOver = driver.findElement(By.xpath("//span[text()='MEN']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(mouseOver).perform();
		
		driver.findElement(By.linkText("Jeans")).click();
		
		act.pause(3000).scrollByAmount(0, 500).perform();
		
		//act.moveToElement(driver.findElement(By.xpath("//div[@class='item rilrtl-products-list__item item']")))
	//	.click(driver.findElement(By.xpath("//span[text()='QUICK VIEW']"))).perform();
		
		WebElement scroll = driver.findElement(By.xpath("//span[text()='occasion type']"));
		
		act.pause(3000).scrollToElement(scroll).perform();
		
		//act.contextClick(); //right click
		//act.doubleClick(); //double click
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		WebElement scr = driver.findElement(By.id("form:drag"));
		WebElement trg = driver.findElement(By.id("form:drop"));
		
		Actions act1=new Actions(driver);
		act1.dragAndDrop(scr, trg).perform();
		
		
		
		
		
		
		
		
		
		
	}

}
