package OtherConcept;

import java.util.Scanner;

public class PalindromeNumber 
{
	// if the given number is 151 -> then that is Palindrome number
	public static void isPalindrome (int num)
	{
		int rev;
		int sum = 0;
		int temp;
		
		temp = num;
		while (num > 0)
		{
			rev = num % 10;
			sum = (sum * 10) + rev;
			num = num / 10;
		}
		if (temp == sum)
			System.out.println("It is a Palindrome number");
		else
			System.out.println("It is not a Palindrome number");
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		isPalindrome(num);
		
		System.out.println("Enter the text to check: ");
		String str = scan.next();
		isPalindromeString(str);
	}
	
	public static void isPalindromeString (String str)
	{
		String temp;
		temp = str;
		
		StringBuffer sb = new StringBuffer(str).reverse();
		System.out.println(sb);
		
		if (temp.contentEquals(sb))
			System.out.println("Is Plaindrome");
		else
			System.out.println("Is not a Palindrome");
	}
}