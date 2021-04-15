package Learning;

import java.util.Scanner;

public class Test_Now 
{
	public static void main (String[] args)
	{
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scn.nextInt();
		cnvrtDeci(num);
		

//		Scanner scn = new Scanner(System.in);
//		System.out.println("Enter the number for x and y: ");
//		int x = scn.nextInt();
//		int y = scn.nextInt();
//		System.out.println(getHCF(x, y));
	}
	
//	public static int getHCF(int x, int y)
//	{
//		int minimum = Math.min(x, y);
//		
//		if(x % minimum == 0 && y % minimum ==0)
//			return minimum;
//		
//		for (int i = minimum / 2; i > 0; i--)
//		{
//			if (x % i == 0 && y % i == 0)
//				return i;
//		}
//		return 1;
//	}	

	public static void cnvrtDeci(int num)
	{
		int binNum[] = new int[1000];
		int i=0;
		while (num > 0)
		{
			binNum[i] = num % 2;
			num = num / 2;
			i++;
		}
		for (int j=i-1; j>=0; j--)
			System.out.print(binNum[j]);
	}
}