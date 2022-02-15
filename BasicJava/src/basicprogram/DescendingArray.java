package basicprogram;

public class DescendingArray 
{

	public static void main(String[] args) 
	{
	
		int a[] =  {4, 5, 6, 7, 8, 4, 7, 9};
		
		for (int i=0; i<a.length; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if (a[i]<a[j])
				{
					a[i]= a[i]+a[j];
					a[j]= a[i]-a[j];
					a[i]= a[i]-a[j];
					
				}
			}
		}
		
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
					
	}

}
