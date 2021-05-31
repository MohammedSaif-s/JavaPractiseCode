package Learning;

public class ReverseString 
{
	public static void main(String[] args)
	{		
		// question can ask like 1. Reverse a given string	
		// 2. diff between String and String Buffer
		// 3. do we have reverse function in String ?
		
		// 1. Using for loop to reverse the given string, and String is Immuteable and it does not have any reverse method
		String str = "Selenium";
		int len = str.length();
		System.out.println(len);
		String rever = "";
		
		for (int i=len-1; i>=0; i--)
		{
			rever = rever + str.charAt(i);
		}
		System.out.println(rever);
		
		// 2. Using StringBuffer class, and it is muteable. StringBuffer class has inbuilt function called reverse
//		StringBuffer buffer = new StringBuffer(str);
//		System.out.println(buffer.reverse());
		String st1 = "SAIF";
		System.out.println(new StringBuffer(st1).reverse());		
	}
}