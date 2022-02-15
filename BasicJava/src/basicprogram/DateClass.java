package basicprogram;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass 
{

	public static void main(String[] args) 

	{
	Date a = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");

	System.out.println(s.format(a));
	System.out.println(sdf.format(a));
	System.out.println(a.toString());
	
		
		
		
	}

}
