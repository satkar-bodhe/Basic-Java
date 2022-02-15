package basicprogram;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx 
{
	
	// Can accept duplicate values.
	// ArraList,LinkedList,vector- Implementing List interface
	// Array have fixed size where as arraylist can grow dynamically
	// You can access and insert any value in any index
	// Maintain sequence. 

	public static void main(String[] args) 
	{
	
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Satkar");
		a.add("Software Tester");
		a.add("Blogfac");
		a.add("Michelin");
		a.add("Pune");
		a.add("Satkar");
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.contains("Pune"));
		System.out.println(a.indexOf("Blogfac"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		
		// List Iterator 
		
		Iterator<String> i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}

}
