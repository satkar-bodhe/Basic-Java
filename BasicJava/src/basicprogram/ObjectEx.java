package basicprogram;

public class ObjectEx // Class is collection of objects 
{

	public void setData() 
	{
		
		System.out.println("Object called method");
		
	}
	
	
	public static void main(String[] args) 
	{
	
		ObjectEx obj = new ObjectEx(); // Object is a instance of a class.
		obj.setData();
		MethodEx obj1 = new MethodEx();
		obj1.getData();
		System.out.println("Main method");
		
	}

}
