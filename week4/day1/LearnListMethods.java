package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnListMethods {

	public static void main(String[] args) {
		List<Integer> value=new ArrayList<Integer>();
		//add()
		value.add(23);
		value.add(21);
		value.add(45);
		value.add(89);
		value.add(22);
		
		System.out.println(value);
		
		//size()-index value -'0'
		int size = value.size();
		System.out.println("Size :"+size);
		
		//contains
		boolean contains = value.contains(20);
		System.out.println("Conatins :"+contains);
		
		//get()-index value start from '0'
		Integer integer = value.get(2);
		
		System.out.println("get :"+integer);
		
		//add number 56 in 4 position
		value.add(4, 56);
		value.add(3, 22);

		System.out.println(value);
		
		//remove
		value.remove(2);
		System.out.println("After Remove :"+value);
		
		//sort
		Collections.sort(value);
		System.out.println("After sort :"+value);
		
		Collections.reverse(value);
		System.out.println(value);
		
		//print all the  values from the list
		for (int i = 0; i < value.size(); i++) {
			System.out.println(value.get(i));
		}
		
		//clear
		value.clear();
		System.out.println("Clear :"+value);
		
		
		int[] n= {23,45,12,45,22,7,464,23};
		//array into list
		
		List<Integer> v=new ArrayList<Integer>();
		
		for (int i = 0; i < n.length; i++) {
			v.add(n[i]);
		}
		System.out.println(v);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
