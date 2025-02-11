package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		int[] num= {23,89,34,21,23,90,34,27,98,78};
		//0-9
		Set<Integer> unq=new TreeSet<Integer>();
		
		//for each loop
		for (Integer i : num) {
			unq.add(i);
		}
		System.out.println(unq);
		
		//convert set into list
		List<Integer> value= new ArrayList<Integer>(unq);
		System.out.println(value.get(3));
		
		
		
		
		
		
		
		
	}
}
