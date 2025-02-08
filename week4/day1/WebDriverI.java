package week4.day1;

public interface WebDriverI {

	//In interface till java 1.7 - 100% abstract method
	//only unimplemented methods till 1.7
	public void findElement();
	
	public void findElements();
	
	//public void get();
	
	//java 1.8 -static and default method -implemented

	static void get() {
		System.out.println("Pass the url");
	}
	
	default void timeOut() {
		System.out.println("wait");
	}


}
