package BasicsofProgramming;

import java.util.Scanner;

public class BasicTriangle
{
	public static void main(String[] args) 
	{
		//ExpectedOutput
//		*
//		* *
//		* * * 
//		* * * *
//		* * * * *
		
		// Solution 1: 
		/*
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
		*/
		
		// Solution 2:
		//System.out.println("*\n* *\n* * *\n* * * *\n* * * * *");
		
		// Solution 3:
		/*
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
				System.out.print("* ");
			System.out.println();
		}
		*/
		
		// Solution 4:
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		for (int i=1; i<=num; i++)
		{
			for (int j=1; j<=i; j++)
				System.out.print("* ");
			System.out.println();
		}
		*/
		
		// Solution 5:
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();		
		triangleStar(num);
	}

	public static int triangleStar(int num) 
	{
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=i; j++)
				System.out.print("* ");
			System.out.println();
		}
		return num;
	}
}
