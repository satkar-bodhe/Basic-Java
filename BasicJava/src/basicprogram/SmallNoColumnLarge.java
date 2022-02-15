package basicprogram;

public class SmallNoColumnLarge 
{

	public static void main(String[] args) 
	{
	
		int a [][]= { 	{2,5,6,8}, 
				  		{6,1},
				  		{4,6,3,7},
					};
		int max = a[0][0];
		int maxrow = 0;
		
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]);
				System.out.print("\t");
				if (a[i][j]>max)
				{
					max= a[i][j];
				    maxrow = i;
				}
				
			}
			System.out.println();
		}
		System.out.println("The maximum value in the given array is " +max);
		System.out.println("The row number of max value is " +maxrow);
		
		int k=0;
		int minno = a[maxrow][0];
		while (k<a[maxrow].length)
		{
			if (a[maxrow][k]< minno)
				minno = a[maxrow][k];
			k++;
		}
		System.out.println("Small no in the row " +maxrow+ " is " +minno );
	}

}
