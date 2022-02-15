package basicprogram;

public class SubClass extends SuperClass
{

	int a = 7;
	String str = "Hello Sub class";
	
	public void print()
	{
		System.out.println(str);
		System.out.println(a);
		System.out.println(super.str);
		System.out.println(super.a);
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("This is the sub method");
		
		
	}
	
	public SubClass() 
	{
		super();
		System.out.println("In a sub class constructor");
	}
	
	public static void main(String[] args) 
	{
	
		SubClass sb = new SubClass();
		sb.print();
		sb.getData();
		
	}

}
