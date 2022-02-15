package basicprogram;

public class SubAirIndia extends SuperAirCraftPlan
{

	public static void main(String[] args) 
	{
	
		SubAirIndia s = new SubAirIndia();
		s.engine();
		s.guidLines();
		s.bodyColour();
		
	}
	
	@Override
	public void bodyColour() 
	{
		System.out.println("Aircraft should be white with Flag logo");
	}
	
}


//Interface and Abstract 

/* Interface - Contains only abstract methods
Access modifiers must be public for methods.
Variables defined must be public Static and final.
To implement we use implements 

Abstract - It can contain abstract methods and concrete methods too.
Except private we can have any access modifiers for methods in abstract class.
Except private variables can have any access modifiers.
To implement abstract we used extends */

