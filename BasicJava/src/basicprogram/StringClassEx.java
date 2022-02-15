package basicprogram;

public class StringClassEx 
{

	public static void main(String[] args) 
	{
	
		String s = "Java Training";
		System.out.println(s.charAt(2)); // gives you the character at index 2
		System.out.println(s.indexOf("a")); // gives you the first index of that character
		System.out.println(s.substring(3,6)); // gives you the character from index 3 to 6.
		System.out.println(s.substring(4)); // gives you the character from 4 index
		System.out.println(s.concat(" Satkar")); // It concatenate the string to the existing one.
		System.out.println(s.length()); // It is calculating the length of string. 
		System.out.println(s.trim()); // It is trimming the spaces before string and after string.
		
	}

}
