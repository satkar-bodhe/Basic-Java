package basicprogram;

import java.util.ArrayList;

public class PrintUniqueNoArray 
{

	public static void main(String[] args) 
	{
	
		int a[]= {1,4,2,5,1,2,4,2,1,4,9,9};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i=0; i<a.length; i++)
		{
			int k=0;
			
			if (!al.contains(a[i]))
			
			{
				al.add(a[i]);
				k++;
				
				for (int j=i+1; j<a.length; j++)
				{
					if (a[i]==a[j])
					{
						k++;
					}
				}
				if (k==1)
				{
					System.out.println("Unique number from the given array is " + a[i]);
				}
			}
		}	
	}
		
}
