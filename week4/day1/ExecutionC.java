package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutionC extends Driver {

	public static void main(String[] args) {
		ExecutionC e=new ExecutionC();
		e.findElement();
		e.findElements();
		e.timeOut();
		WebDriverI.get();
		
		ChromeDriver driver=new ChromeDriver();
		driver.findElement(By.id("")).sendKeys(args);

	}

	@Override
	public void findElements() {
		System.out.println("TC 2 Completed");
		
	}

}
