package Learning;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		// Fibonacci Series		
//		int num1=0, num2=1, total=10;
//		System.out.println("Fibonacci of total numbers looking are : " +total);
//		
//		for (int i=1; i<=total; ++i)
//		{
//			System.out.println(num1 + " ");
//			
//			int sumOfPrevNums = num1 + num2;
//			num1 =num2;
//			num2 = sumOfPrevNums;
//		}
		
		
		// ArrayList
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		ArrayList<Integer> arrList = new ArrayList<Integer>(n);
		for (int i=1; i<=n; i++)
			arrList.add(i);		
		System.out.println(arrList);
		
		arrList.remove(3);
		System.out.println(arrList);
		
		for (int i=0; i<arrList.size(); i++)
		{
			System.out.print(arrList.get(i) + " ");
		}	
	}
}