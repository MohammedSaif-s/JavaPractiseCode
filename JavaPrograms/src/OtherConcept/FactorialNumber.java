package OtherConcept;

import java.util.Scanner;

public class FactorialNumber
{
	// 1. Without recursive - using for loop
	public static int factorial(int num)
	{
		int fact=1;
		
		if (num == 0)
			return 1;
		
		for(int i=1; i<=num; i++)
			// for(int i=num; i>0; i--)
		{
			fact = fact * i;
		}
		return fact;
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		System.out.println(factorial(num));
		
	}	
}