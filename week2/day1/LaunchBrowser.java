package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
//step 1- open the browser
		//ctrl+shift+o -import stmt
		ChromeDriver driver=new ChromeDriver();
		
	//step 2 -	 Maximize the browser
	driver.manage().window().maximize();	
		
	//step 3- load the url-> get() to pass the url
	driver.get("https://www.gmail.com");
	
	//java wait -Thread.sleep();
	Thread.sleep(3000);
	
	//step 4- after completing the steps close the browser
	driver.close();

	}

}
