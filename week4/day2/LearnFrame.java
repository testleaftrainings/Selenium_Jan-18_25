package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		//come back to main page
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//li[@id='menuform:j_idt38']//a")).click();
		
		
		
		
	}

}
