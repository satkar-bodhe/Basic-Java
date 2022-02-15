package basicprogram;

public class ForLoopEx2 
{

	public static void main(String[] args) 
	{
	
		int k =10;
		
		for (int i=0; i<4; i++)
		{
			for (int j=0; j<4-i; j++)
			{
			
			System.out.print(k);
			
			System.out.print("\t");
			
			k--;
			
			}
			
			System.out.println();
		}

		int l = 10;
		
		for (int i=4; i>0; i--)
		{
			for (int j=i-1; j>=0; j--)
			{
			
			System.out.print(l);
			
			System.out.print("\t");
			
			l--;
			
			}
			
			System.out.println();
		}
		
	}

}



