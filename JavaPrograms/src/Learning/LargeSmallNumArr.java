package Learning;

import java.util.Arrays;

public class  LargeSmallNumArr
{
	public static void main(String[] args) 
	{
		int numbers[] = {-69, 11, 200, 34, 1, -2, 2345};
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for (int i=1; i<numbers.length; i++)
		{
			if (numbers[i] > largest)
				largest = numbers[i];
			else if (numbers[i] < smallest)
				smallest = numbers[i];
		}
		System.out.println("Given number of arrays are: " +Arrays.toString(numbers));
		System.out.println("Largest number is : " +largest);
		System.out.println("Smallest number is: " +smallest);
	}
}