package basicprogram;

public class LargeNoArray 
{

	public static void main(String[] args) 
	{
	
		int xyz [][] = { {2,3,5,6}, {6,3,8,9}, {4,7,5}};
		int max = xyz[0][0];
		
		for (int i=0; i<xyz.length; i++)
		{
			for (int j=0; j<xyz[i].length; j++)
			{
				if (xyz[i][j]>max)
					max = xyz[i][j];
				System.out.print(xyz[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println("The largest number from the array is " +max);
	
	}

}
