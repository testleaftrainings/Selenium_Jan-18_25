package week3.day2;

public class ChromeDriverC extends ChromiumDriverP{

	public void chromedriver() {
		System.out.println("Browser type is chrome");
	}
	
	
	
	public static void main(String[] args) {
		ChromeDriverC cdc=new ChromeDriverC();
		//2-gp,1-p,1-c
		cdc.findElement();
		cdc.findElements();
		cdc.chromeOptions();
		cdc.chromedriver();
	}
}
