package week1.day2;

public class PrintEvenNumber {

	public static void main(String[] args) {

		int value=10;
		//for loop
		//if condition
		for (int i = 0; i <=value; i++) {
			//0,1,2,3,4,5,6,7,8,9,10
			if(i%2==0) {
				//if(0==0),(1%2==0),(2%2==0)........(10%2==0)
				System.out.println("Even number is :"+i);
			}
			
		}
	}

}
