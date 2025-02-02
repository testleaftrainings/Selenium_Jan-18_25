package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class EdgeDriverP extends RemoteWebDriverGP{

	public void findElement() {
		super.findElement();
		System.out.println("Edge browser");
	}
//super keyword- it used to get parent class methods in child class
	
	public static void main(String[] args) {
		EdgeDriverP ed=new EdgeDriverP();
		ChromeDriver d= new ChromeDriver();
		d.quit();
		
		ed.findElement();
		ed.findElements();
		
	}
	
	
}
