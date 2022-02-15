package basicprogram;

import java.util.Scanner;

public class IfElseEx 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the your percentages");
		double per = sc.nextDouble();
		
		
		if (per<=35 && per>=0)
		{
			System.out.println("You are failed");
		}
		else if (per>35 && per<55)
		{
			System.out.println("Your grade is D");
		}
		else if (per>=55 && per<65)
		{
			System.out.println("Your grade is C");
		}
		else if (per>=65 && per<80)
		{
			System.out.println("Your grade is B");
		}
		else if (per>=80 && per<90)
		{
			System.out.println("Your grade is A");
		}
		else if (per>=90 && per<=100)
		{
			System.out.println("Your grade is A+");
		}
		else
			System.out.println("Not valid value, enter the values in between 0-100");
	}

}
