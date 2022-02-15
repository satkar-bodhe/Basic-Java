package basicprogram;

public class ForLoopEx3 
{

	public static void main(String[] args) 
	{
		
		for (int i=0; i<4; i++)
		{
			for (int j=1; j<5-i; j++)
			{
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
		for (int i=4; i>=0; i--)
		{
			for (int j=1; j<=5-i; j++)
			{
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
