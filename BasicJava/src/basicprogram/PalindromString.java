package basicprogram;

public class PalindromString 
{

	public static void main(String[] args) 
	{
	
		String a = "madam";
		String b = "";
		
		int len = a.length();
		
		for (int i = len-1; i>=0; i--)
		{
			b= b+a.charAt(i);
			
		}
		System.out.println(b);
		b = b.trim();
		
		if (a.equals(b))
		{
			System.out.println("Given string is palindrome");
		}
		else 
		{	
			System.out.println("Given string is not palindrome");
	
		}
	}

}
