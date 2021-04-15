package Learning;

import java.util.Scanner;

public class TestRecheck1 
{
	public static void main(String[] args) 
	{
		// Square star pattern
//		* * * *
//		* * * *
//		* * * *
//		* * * *
		/*
		for (int i=0; i<4; i++)
		{
			for (int j=0; j<4; j++)
				System.out.print("* ");
			System.out.println("");
		}*/		
		
		// Rectangle star pattern
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
		/*
		for(int i=1; i<=5; i++)
		{
			for (int j=1; j<=5; j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		*/
		
		// Hallow star pattern
//	* * * *
//	*	  *	
//	*	  *
//	* * * *
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the row and column number: ");
		int row = scn.nextInt();
		int column = scn.nextInt();
		
		/*
		for (int i=1; i<=row; i++)
		{
			for (int j=1; j<=column; j++)
			{
				if ((i==1 || i==column) || (j==1 || j== column))
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println("");
		}*/
		
		// Hallow Rectangle star pattern 
//		* * * * * * 
//		*         * 
//		*         * 
//		*         * 
//		*         * 
//		* * * * * *
		/*
		for (int i=1; i<=row; i++)
		{
			for (int j=1; j<=column; j++)
			{
				if ((i==1 || i== column) || (j==1 || j==column))
					System.out.print("* ");
				else
					System.out.print("  ");
			}System.out.println("");
		}*/
		
		// Rhombus star pattern
		
//		* * * * 
//		  * * * * 
//		   * * * * 
//		    * * * *
		/*
		for (int i=1; i<=row; i++)
		{
			for (int j=1; j<=i; j++)
				System.out.print(" ");
			for (int j=1; j<=column; j++)
				System.out.print("* ");
			System.out.println("");
		}
		*/
		//Rhombus triangle star pattern
//		 * * * * * *  
//		  * * * * * *  
//		   * * * * * *  
//		    * * * * * *  
//		     * * * * * *  
//		      * * * * * *
		/*
		for (int i=1; i<=row; i++)
		{
			
			for (int j=1; j<=i; j++)
				System.out.print(" ");
			
			for (int j=1; j<=column; j++)
				System.out.print("* ");
			
			System.out.println();
		}*/
		
		for (int i=0; i<row; i++)
		{
			for (int j=row; j>i; j--)
				System.out.print(" ");
			for (int j=0; j<row; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}