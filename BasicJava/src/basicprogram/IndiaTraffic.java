package basicprogram;

import DemoPackage.CentralTraffic;
import DemoPackage.ContinentalTraffic;

public class IndiaTraffic implements CentralTraffic, ContinentalTraffic 
{

	public static void main(String[] args) 
	
	{
	
		ContinentalTraffic r = new IndiaTraffic();
		r.streetSymbols();
	
		CentralTraffic s = new IndiaTraffic();
		s.redStop();
		s.yellowHalt();
		s.greenGo();
		
				
		
	}

	@Override
	public void redStop() 
	{
		System.out.println("Please Stop");	
	}

	
	@Override
	public void yellowHalt() 
	{
		System.out.println("Please Halt");
	}

	@Override
	public void greenGo() 
	{
		System.out.println("Please Go");	
	}

	@Override
	public void streetSymbols() 
	{
		System.out.println("These are the Street symbols rules");	
	}

}
