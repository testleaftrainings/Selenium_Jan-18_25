package week3.day1;

public class PrintDuplicateValues {

	public static void main(String[] args) {

		int[] data= {23,67,89,67,32,21,90,23};
		// nested for loop 
		//i and j
		//if condition with ==
		//print duplicate value
		
		//outer for loop -[0] =23 ,[1]=67
		for (int i = 0; i < data.length; i++) {
		
		 	//inner for loop - next index =i+1 =67,1+1=2=>89
			for (int j = i+1; j < data.length; j++) {
				
				if(data[i]==data[j]) {
					System.out.println("Duplicate values in the array :"+data[j]);
				}
			}
			
			
		}
		
	}
	

	
	// sort the array
	//{21,23,23,32,67,67,89,90}
	//single for loop - (length-1)
	//if data[i]==data[i+1]
	
	
	
	
	
	
	

}
