package basicprogram;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx 
{
	
		// Can accept duplicate values.
		// ArraList,LinkedList,vector- Implementing List interface
		// Array have fixed size where as arraylist can grow dynamically
		// You can access and insert any value in any index
		// Maintain sequence. 

	public static void main(String[] args) 
	{
	
		LinkedList<String> a = new LinkedList<String>();
		
		a.add("Satkar");
		a.add("QA");
		a.add("Michelin");
		a.add("Blogfac");
		a.add("Pune");
		a.add("Michelin");
		a.add("Pune");
		System.out.println(a);
		
		Iterator i = a.iterator();
		
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}

}
