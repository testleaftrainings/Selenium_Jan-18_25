package week3.day1;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {

		int[] numbers= {2,9,3,5,10,23,45,33};
		
		int data[]= {4,7,3,5};
		//index start from '0'
		
		//find length of the array
		int totalSize = numbers.length;
		System.out.println("Size :"+totalSize);
		//find the first value in the array
		System.out.println("First index value :" +numbers[0]);
		//find the last value in the array
		System.out.println("last index value :"+numbers[totalSize-1]);
		//Find second smallest number in given array
		//array - sort() 
		Arrays.sort(numbers);
		System.out.println("Second smallest value :"+numbers[1]);
		
		//for loop
		for (int i = 0; i < totalSize; i++) {
			System.out.println(numbers[i]);
		}
		
	}

}
