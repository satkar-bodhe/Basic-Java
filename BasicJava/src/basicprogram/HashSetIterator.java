package basicprogram;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator 
{

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
		
		Iterator<String> i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}

}
