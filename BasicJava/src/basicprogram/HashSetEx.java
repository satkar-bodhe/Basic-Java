package basicprogram;

import java.util.HashSet;

public class HashSetEx 
{

		// Can not accept duplicate values.
		// HashSet,LinkedHashSet,TreeSet- Implementing Set interface
		// No sequence maintain. 
		//HashSet treeset, LinkedHashset implements Set interface
	
	public static void main(String[] args) 
	{
	
		HashSet<String> hs = new HashSet<String>();
		hs.add("Satkar");
		hs.add("QA");
		hs.add("Michelin");
		hs.add("Pune");
		hs.add("Satkar");
		hs.add("QA");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		
		
	}

}
