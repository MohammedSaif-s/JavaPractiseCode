package OtherConcept;

import java.util.Scanner;

public class PrimeNumbers 
{
	public static boolean isPrimeNumber(int num)
	{
		if (num <= 1)
			return false;
		for (int i=2; i < num; i++)
		{
			if (num % i == 0)
				return false;
		}
		return true;
	}
	
	public static void getPrime(int num1)
	{
		for (int i=2; i<=num1; i++)
		{
			 if (isPrimeNumber (i))
				 System.out.print(i + " ");
		}
	}
	
	public static void main (String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		System.out.println("Given number is: " + num + " , and it is " + isPrimeNumber(num));
		
		System.out.println("Enter how many number: ");
		int num1 = scan.nextInt();
		
		getPrime(num1);
	}
}