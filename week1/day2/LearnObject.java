package week1.day2;

public class LearnObject {

	public static void main(String[] args) {
		
		//create object for that class to use that methods inside this class
		LearnMethodAndObject mo=new LearnMethodAndObject();
		mo.browserName();
		System.out.println(mo.courseTitle());
		mo.name("Java", 19);
		
		//private method we cannot access in other class

		LearnObject ob=new LearnObject();
	}

}
