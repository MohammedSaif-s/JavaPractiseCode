package OtherConcept;

import java.util.Scanner;

public class TestMethod 
{
	/*
	public static void fibonacciSeries(int num1, int num2, int total)
	{
		for (int i=1; i<=total; i++)
		{
			System.out.println("Numbers are: "+ num1);
			int sumOfPreviousNumbers = num1 + num2;
			num1 = num2;
			num2 = sumOfPreviousNumbers;
		}		
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int total = scan.nextInt();
		
		fibonacciSeries(num1, num2, total);
	}*/
	
	/*
	public static void main (String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		isPrimeNumber(num);
		System.out.println("Given number is: " +num+ " and it is " + isPrimeNumber(num));
		
		
		System.out.println("Enter the number: ");
		int num1 = scan.nextInt();
		getPrimeNum(num1);
	}
	
	public static boolean isPrimeNumber(int num)
	{
		if (num <= 1)
			return false;
		for (int i=2; i<num; i++)
		{
			if (num % i==0)
				return false;
		}
		return true;
	}
	
	public static void getPrimeNum(int num1)
	{
		for (int i=2; i<=num1; i++)
		{
			if (isPrimeNumber(i))
				System.out.println(i + " ");
		}
	}
	*/

	/*
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		isArmstrongNumber(num);
	}
	
	public static void isArmstrongNumber(int num)
	{
		int r;
		int cube=0;
		int temp;
		temp = num;
		
		while (num >0)
		{
			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);
		}
		if (temp == cube)
			System.out.println("Is Armstrong Number");
		else
			System.out.println("Is not an Armstrong Number");
	}*/
	
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		isPalindrome(num);
	}
	
	public static void isPalindrome(int num)
	{
		System.out.println("Given number is : " +num);
		
		int r;
		int sum=0;
		int temp;
		temp = num;
		
		while (num >0)
		{
			r = num % 10;
			sum = (sum * 10) + r; 
			num = num / 10;
		}
		if (temp == sum)
			System.out.println("It is a Plaindrome number");
		else
			System.out.println("It is not a Palindrome number");
	}
}