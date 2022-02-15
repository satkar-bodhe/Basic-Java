package basicprogram;

public class ForLoopEx1 
{

	public static void main(String[] args) 
	{
		
		int k=1;
	
		for(int i=4; i>0; i--) // By decrementing i and j value.  
		{
			
			for(int j=4; j>i-1; j--)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
		}
		
	
		int l =3;
		int sum = 0;
		 
		
		for(int i=0; i<4; i++)  // By incrementing i and j value. 
		{
			
			for(int j=0; j<i+1; j++)
			{
				sum = sum +3;
				System.out.print(sum);
				System.out.print("\t");
				
			}
			System.out.println();
		}
		
	}

}
