package week1.day2;

public class LearnMethodAndObject {

	//normal method should be created inside class
	
	//AM returnType methodName(input agrs)
	
	public void browserName() {
		System.out.println("Chrome");
		/*
		 * int a=10; int b=5; System.out.println(a+b);
		 */
	}
	private  int browserVersion() {
		return 131;
		
	}
	//for input agrs where need to pass the value inside main method
	protected void name(String name,int date) {
		System.out.println("Name :"+name+" "+"Date :"+date);
	}

	String courseTitle() {
		return "Java";		
	}
	public static void main(String[] args) {
		//create object for the class
		LearnMethodAndObject mo=new LearnMethodAndObject();
		
		//call the method with help object
		//objectName.methodName();
		mo.browserName();
		
		//if you have used return value inside method
		//ctrl+2+l -> choose 2nd option
		int browserVersion = mo.browserVersion();
		System.out.println(browserVersion);
		
		String courseTitle = mo.courseTitle();
		System.out.println(courseTitle);
		
		System.out.println(mo.courseTitle());
		
		mo.name("Testleaf", 19);
		
		
		
		

	}

}
