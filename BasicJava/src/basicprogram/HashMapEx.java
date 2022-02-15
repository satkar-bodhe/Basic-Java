package basicprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx 
{

	public static void main(String[] args) 
	{
	
		HashMap<Integer, String> obj = new HashMap<Integer, String>();
		obj.put(0,"Hello");
		obj.put(1,"Satkar");
		obj.put(2,"How are you?");
		obj.put(3,"I am good");
		System.out.println(obj.get(2));
		//obj.remove(42);
		System.out.println(obj.get(42));
		
		Set sn = obj.entrySet();
		
		Iterator a = sn.iterator();
		
		while (a.hasNext())
		{
			Map.Entry mp = (Map.Entry)a.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
		}
		
	}

}
