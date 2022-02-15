package basicprogram;

public class TryCatch 
{

	public static void main(String[] args) 
	{
	
		int a = 7;
		int b = 0;
		
		try 
		{
			int c = a/b; // Arithmetic Exception
		
			int arr [] = new int[5]; // Index out of bound Exception
			
			System.out.println(arr[7]);
		}
		
		catch(ArithmeticException At)
		{
			
			System.out.println("Catched error, Arithmetic Exception");
		
		}
		catch(IndexOutOfBoundsException ae)
		{
			System.out.println("Catched Error, Index out of bound Exception");
		}
	
		catch (Exception e)
		{
			System.out.println("You have an error in compile");
		}
		
	}

}
