package OtherConcept;

import java.util.Scanner;

public class ArmstrongNumber
{
	public static void isArmstrongNumber (int num)
	{
		int rev;
		int cube=0;
		int temp;
		temp=num;
		
		while (num > 0)
		{
			rev = num % 10;
			num = num / 10;
			cube = cube + (rev * rev * rev);
		}
		if (temp == cube)
			System.out.println("Is Armstrong number");
		else
			System.out.println("Is not Armstrong number");
	}
	
	public static void main(String[] args) 
	{
		// Armstrong number is a number that is equal to the sum of cubes of its digits. 
		//For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		isArmstrongNumber(num);
	}
}