package basicprogram;

public class MethodEx 
{

	public String getData() // Method outside main method, it is block outside the main method. 
	
	{
		
		System.out.println("In a outside method");
		return "Satkar";
	}
	
	
	
	public static void main(String[] args) 
	{
	
		
		System.out.println("In a main method");
		MethodEx obj = new MethodEx();
		obj.getData();
		String A = obj.getData();
		System.out.println("Return Value from outside method is " +A);
		
		
	}

}
