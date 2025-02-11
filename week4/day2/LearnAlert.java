package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		//simple alert-1
		
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		//UnhandledAlertException
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		String text = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text);
		
		Thread.sleep(3000);
		//confirmation alert - 2(ok/cancel - yes/no)
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		alert.dismiss();
		
		Thread.sleep(2000);
		alert.accept();
		//NoAlertPresentException
		
		
	}

}
