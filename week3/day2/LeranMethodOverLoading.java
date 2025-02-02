package week3.day2;

public class LeranMethodOverLoading {

	public void browser(int a,int b) {
System.out.println("add "+(a+b));
	}


	public void browser(String url) {
System.out.println(url);
	}

	public void browser(int version,String browserName) {
System.out.println(version+"  "+browserName);
	}

	public void browser(String browserName,int version) {
System.out.println(browserName+"  "+version);
	}

	public static void main(String[] args) {
		LeranMethodOverLoading ol=new LeranMethodOverLoading();
		
		ol.browser(7,9);
		ol.browser("https://platform.testleaf.com");
		ol.browser(131, "Chrome");
		ol.browser("Edge", 132);
		
		//println();- example for MethodOverLoading
		System.out.println();
		
		
		
		
	}
	
}
