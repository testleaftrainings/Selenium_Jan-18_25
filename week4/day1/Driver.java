package week4.day1;

public abstract class Driver implements WebDriverI {

	@Override
	public void findElement() {
System.out.println("TC 1 completed");
		
	}

	//abstract is 0 to 100 abstract methods
	//both implements and unimplements 
	
	public static void main(String[] args) {
		
		//we can able to create object for abstract class? No/Yes - NO
		//Driver d=new Driver();
		
		//we can able to create object for Interface? Yes/No-  NO
		//WebDriverI w=new WebDriverI();
		
	}
}
