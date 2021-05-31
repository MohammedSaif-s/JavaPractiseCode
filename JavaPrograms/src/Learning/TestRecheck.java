package Learning;

import java.util.Scanner;

public class TestRecheck 
{
	public static void main (String[] args)
	{
		/*
		// 1. A) Reverse a given string
		// "Selenium"	// muineleS
		String str = "Selenium";
		System.out.println(str);
		int len = str.length();
		System.out.println(len);
		String rev = "";
		for (int i=len-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
		// B)
		String str1 = "MOHAMMED";
		StringBuffer buffer = new StringBuffer(str1);
		System.out.println(buffer.reverse());
		*/
		
		/*
		// 2. Remove Junk/ Special characters
		String st = "%^$%Java $%%^ Selenium **(^& Program";
		st = st.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(st);
		*/
		
		/*
		// 3. Missing number in an array
		int a[] = {1,2,3,4};
		int sum = 0;
		for(int i=0; i<a.length; i++)
		{
			sum = sum + a[i];
		}
		System.out.println(sum);
		
		
		int sum1 = 0;
		for (int j=1; j<=5; j++)
		{
			sum1 = sum1+j;
		}
		System.out.println(sum1);
		System.out.println(sum1-sum);
		*/
		
		/*
		// 4. Swapping a number
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number for A and B: ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		
//		int temp = a;
//		a= b;
//		b=temp;
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping A is: " +a);
		System.out.println("After swapping B is: " +b);
		*/
		
		// 5. Reverse a given number
		int num = 34567;
		int rev = 0;
		while (num!=0)
		{
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
		
		long num1 = 3748308403940347L;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}
}