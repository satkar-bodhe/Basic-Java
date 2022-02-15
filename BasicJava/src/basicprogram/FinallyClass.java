package basicprogram;

public class FinallyClass 
{

	// One try can be followed by multiple catch blocks.
	// Catch should be an immediate block after try.
	// Whether try or catch blocks are not run then also finally block run.
	
	public static void main(String[] args) 
	{
		int a=7;
		int b=0;
		
		try 
		{
			//int c = a/b;
			
			//int d[] = new int[5];
			
		}
		catch (ArithmeticException et)
		{
			System.out.println("This is arithmetic excetion error");
		}
		catch (IndexOutOfBoundsException ei)
		{
			System.out.println("Index out of bound excption error");
		}
		catch (Exception e)
		{
			System.out.println("Catch all exception errors");
		}
		finally 
		{
			System.out.println("Whether all try catch blocks failed then also it will execute");
		}
	}

}
