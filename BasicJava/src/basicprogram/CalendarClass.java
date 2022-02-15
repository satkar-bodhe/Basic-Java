package basicprogram;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClass 
{

	public static void main(String[] args) 
	{
	
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
	System.out.println(s.format(cal.getTime()));
	System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	System.out.println(cal.get(Calendar.MINUTE));
	
		
	}

}
