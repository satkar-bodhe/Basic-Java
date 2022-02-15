package basicprogram;

public class SmallestNoArray 
{

	public static void main(String[] args) 
	{
	
		int abc [][] = { {9, 4, 5}, {6, 7, 8, 9}, {2, 6, 1, 8, 3} };
		int min = abc[0][0];

		for (int i=0; i<abc.length; i++)
		{
			for (int j=0; j<abc[i].length; j++)
			{
				if (abc[i][j] < min)
				
					min = abc[i][j];
				System.out.print(abc[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		System.out.println("Minimum value from above array is the " +min);
		
		
	}

}
