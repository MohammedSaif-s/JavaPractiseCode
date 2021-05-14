package Learning;

public class ReverseInteger
{
	public static void main(String[] args) 
	{
		// How will I reverse a given Integer number
		//1. Using proper algo
		long num = 135792468718L;
		long rev = 0;
		
		System.out.println(num);
		
		while (num != 0)
		{
			rev = rev * 10 + num % 10;	// only reminder value will get like 12345 % 10 --> 5
			num = num / 10;	// quotient only will take
		}
		System.out.println("Reversed number : " +rev);
		
		// 2. Using String Buffer
		long num1 = 6456837439358436587L;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
	}

}
