package basicprogram;

public class ConstructorClass 
{

	public ConstructorClass()
	{
		System.out.println("In a default constructor");
	}
	
	public ConstructorClass (int a)
	{
		System.out.println("In a parameterized Constructor");
	}
	
	public ConstructorClass (String str)
	{
		System.out.println("In a string parameterized constructor");
	}
	
	public void constructorClass() 
	{
	System.out.println("In a method");	
	}
	
	public static void main(String[] args) 
	{
	
		ConstructorClass a = new ConstructorClass();
		ConstructorClass b = new ConstructorClass(5);
		ConstructorClass c = new ConstructorClass("Hello");
		
		
		
	}

}
