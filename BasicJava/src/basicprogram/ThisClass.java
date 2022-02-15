package basicprogram;

public class ThisClass 
{
	
	int a =8;
	
	public void getData()
	{
		int a=6;
		int b = a+this.a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
	
		ThisClass tc = new ThisClass();
		tc.getData();
	}

}
