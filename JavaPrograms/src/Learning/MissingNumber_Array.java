package Learning;

public class MissingNumber_Array
{
	public static void main(String[] args) 
	{
		/*
		int a[] = {2,5,1,7,8,3,6}; // unsorted array 
		int sum = 0;
		System.out.println(a.length);
		for(int i=0; i<a.length;i++)
		{
			sum = sum + a[i];
		}
		System.out.println("Sum of all the above given number is: " +sum);
		
		int b[] = {1,2,3,4,5,6,7,8};	//18
		System.out.println(b.length);
		int sum1 = 0;
		for(int j=1; j<=b.length; j++)
		{
			sum1 = sum1+j;
		}
		System.out.println(sum1);
		System.out.println("Final missing number is: " +(sum1-sum));	//18-17->1
		*/
		
		int[] num = {1,2,4,5,5,6,6,7,7,9};
		int[] register = new int[num.length];
		System.out.println(register);
		
		for (int i : num)
		{
			register[i] = 1;
		}
		System.out.println(register.length);
		System.out.println("Missing numbers are: ");
		
		for(int i=1; i<register.length; i++)
		{
			if (register[i] == 0)
			{
				System.out.println(i);
			}		
		}
	}
}