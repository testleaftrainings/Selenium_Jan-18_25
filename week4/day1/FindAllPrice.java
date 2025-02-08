package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllPrice {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys",Keys.ENTER);
		//return type findElements -> List<WebElement>
		List<WebElement> allPrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		int totalSize = allPrice.size();
		System.out.println("Total prices is present :"+totalSize);
		
		for (int i = 0; i < allPrice.size(); i++) {
			
			String text = allPrice.get(i).getText();
			System.out.println(text);
		}
	}

}
