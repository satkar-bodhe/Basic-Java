package basicprogram;

public class ChildClassInheritance extends ParentClassInheritance 
{
	
	public void engine() 
	{
	System.out.println("Engine is implemented");	
	}
	
	public void colour()
	{
		System.out.println(colour);
	}
	
	
	public static void main(String[] args) 
	{
	
		ChildClassInheritance sc = new ChildClassInheritance();
		sc.gear();
		sc.engine();
		sc.breaks();
		sc.audio();
		sc.colour();
		
		
	
		
	}

}
