package week4.day1;

//need connect interface and normal class- implements
public class RemoteWebDriverC implements WebDriverI {

	public void findElement() {
		System.out.println("Take only one value");
		
	}

	public void findElements() {
System.out.println("Take more than one value");		
	}
	
	public static void main(String[] args) {
		RemoteWebDriverC rc=new RemoteWebDriverC();
		rc.findElement();
		rc.findElements();
		
		//static method -interface.method
		WebDriverI.get();
		rc.timeOut();
	}

}
