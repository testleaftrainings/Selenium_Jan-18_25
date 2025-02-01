package week3.day1;

public class LeranStringMethods {

	public static void main(String[] args) {

		String comName="Test Leaf"; //303
		String name=new String("Test Leaf"); //607
		
		//find length()
		int size = comName.length();
		System.out.println("total length of the String :"+size);
	
	//equals -compare two string content
		if(comName.equals(name)) {
			System.out.println("Matched");
		}else {
			System.out.println("Not Matched");
		}
	//what difference b/w .equals() & ==
		//== compare the memory address
		
		if(comName==name) {
			System.out.println("Matched");
		}else {
			System.out.println("Not Matched");
		}
		
		//EIC
		String a="Dilip";
		String b="dIliP";
		
		if(a.equalsIgnoreCase(b)) {
			System.out.println("EIC :Matched");
		}else {
			System.out.println("Not Matched");
		}
	
		
		//charAt()
		//index value start from '0'
		String topic="String";
		char charAt = topic.charAt(3);
		System.out.println("index of 3 :"+charAt);
		
		
		//toCharArray
		String name1="Selenium";
		char[] ch = name1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		//Reverse String
		for (int i = ch.length-1; i >=0; i--) {
			System.out.print(ch[i]);
		}
		
		System.out.println();
		//replace - single char
		String d="Java";
		//J$v$;
		
		String replace = d.replace(' ', '$');
		System.out.println(replace);
		
		//Split- 
		String e="Java is mothermood language for SeleniumWebDriver";
		//JavaismothermoodlanguageforSeleniumWebDriver
		
		String[] split = e.split(" ");
		for (int i = 0; i < split.length; i++) {
		System.out.print(split[i]);	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
