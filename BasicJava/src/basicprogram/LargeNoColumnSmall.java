package basicprogram;

public class LargeNoColumnSmall 
{

	public static void main(String[] args) 
	{
	
		int xyz [][] = { 
						{2,3,4,5,6}, 
						{6,5,2}, 
						{4,2,8,1,6}
						};
		
		int min = xyz[0][0];
		int mincolumn = 0; 
		
		for (int i=0; i<xyz.length; i++)
		{
			for (int j=0; j<xyz[i].length; j++)
			{
				System.out.print(xyz[i][j]);
				System.out.print("\t");
			
				if (xyz[i][j] < min)
				{
					min = xyz [i][j];
					mincolumn = j;
				}	
			}
			System.out.println();
		}
		

		
		System.out.println("Smallest number in the array is " + min);
		
		System.out.println("Column number of the " +min+ " is " +mincolumn);
	
		System.out.println("");
		
		int k = 0;
		int max = -1;	
		
		while (k<xyz.length)
		{
			System.out.println(mincolumn +", "+k+", "+ xyz[k].length);
			if (xyz[k].length>mincolumn && xyz[k][mincolumn]>max)
			{
				max = xyz[k][mincolumn];
				
			}
			k++;
		}
		System.out.println("Max value in the " +mincolumn+ " column is " +max);
	}
	
	
	


}
