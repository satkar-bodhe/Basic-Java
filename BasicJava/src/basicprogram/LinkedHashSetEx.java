package basicprogram;

import java.util.LinkedHashSet;

public class LinkedHashSetEx 
{
	
		// When we want to store group of elements as a single entity where duplicates are not allowed 
		// insertion order is  preserved then we will use set.
		// Do not store duplicate elements and want to preserve insertion order


	public static void main(String[] args) 
	{
	
		LinkedHashSet<String> obj = new LinkedHashSet<String>();
		
		obj.add("Satkar");
		obj.add("Blogfac");
		obj.add("Team");
		obj.add("Satkar");
		obj.add("QA");
		obj.add("Blogfac");
		
		System.out.println(obj);
		
		
	}

}
