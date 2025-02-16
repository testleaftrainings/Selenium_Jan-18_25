package week5.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeranWebTable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/table.xhtml");
		String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).getText();
		
		System.out.println("row value :"+text);
		
		String text2 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[3]/td[4]")).getText();
		System.out.println("3rd row 4th col value :"+text2);
		
		//get row count
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
		int rowCount = row.size();
		
		System.out.println("Row value :"+rowCount);
		
		//get col count
		List<WebElement> col = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
		int colCount = col.size();
		System.out.println("Col value:"+colCount);
		
		//for loop to get all the data
		
		for (int i = 1; i <=rowCount; i++) {
			
			
			for (int j = 1; j <=colCount; j++) {
				
String text3 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
System.out.println(text3);
				
			}
		}
		
		for (int i = 1; i <=rowCount; i++) {
			String text4= driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td[5]")).getText();
		System.out.println(text4);
		}
		
		
		
		
		
		
		
		

	}

}
