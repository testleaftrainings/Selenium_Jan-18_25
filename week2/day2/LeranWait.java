package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeranWait {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		//Selenium wait
		//Implicit wait - common wait for all findElement -element is find in 15 mins ,it will go next code
		//Thread.sleep(3000) - it will wait for 3sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30))
		
		driver.findElement(By.xpath("//div[contains(@class,'react-autosuggest__container')]/input")).sendKeys("shrit",Keys.ENTER);

		
		String text2 = driver.findElement(By.xpath("//div[@class='contentHolder']//strong")).getText();
		System.out.println(text2);
		
		//if any value need from application - getText()
		//ctrl+2 -> local variable
		String text = driver.findElement(By.xpath("//span[@class='price  ']/strong")).getText();
		System.out.println(text);
		
	}

}
