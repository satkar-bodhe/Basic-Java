package basicprogram;

public class AscendingArray 
{

	public static void main(String[] args) 
	{
	
		int a []= {4, 7, 3, 4, 9, 5};
		
		for (int i=0; i<a.length; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if (a[i]>a[j])
				{
					a[i]= a[i]+a[j];
					a[j]= a[i]-a[j];
					a[i]= a[i]-a[j];
					
				}
			}
		}
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
