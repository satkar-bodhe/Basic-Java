package basicprogram;

import java.util.TreeSet;

public class TreeSetEx 
{
	
		// When we want to store group of elements as a single entity where duplicates are not allowed.
	
		// insertion order is not preserved then we will use set.
		
		// Sort element in ascending order ,do not allow duplicate.
		
		// Alphabetical sort 


	public static void main(String[] args) 
	{
	
		TreeSet<String> obj = new TreeSet<String>();
		obj.add("Satkar");
		obj.add("QA");
		obj.add("Blogfac");
		obj.add("Satkar");
		obj.add("Blogfac");
		
		System.out.println(obj);
		
		TreeSet<Integer> obj3 = new TreeSet<Integer>();
		obj3.add(500);
		obj3.add(80);
		obj3.add(5);
		obj3.add(700);
		obj3.add(2);
		obj3.add(80);

		System.out.println(obj3);

		
	}

}
