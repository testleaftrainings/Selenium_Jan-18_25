package week3.day2;

public class ChromiumDriverP extends RemoteWebDriverGP {

	public void chromeOptions() {
		System.out.println("handle pop message");
	}
	
	
	
	public static void main(String[] args) {
		ChromiumDriverP cd=new ChromiumDriverP();
		
		cd.findElement();
		cd.findElements();
		cd.chromeOptions();
		
		
	}
}
