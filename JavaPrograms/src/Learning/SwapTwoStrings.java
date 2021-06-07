package Learning;

public class SwapTwoStrings
{
	public static void main(String[] args) 
	{
		String a = "Hello";
		String b = "World";
		System.out.println("Value before swapping: ");
		System.out.println("The value of a is: " +a);
		System.out.println("The value of b is: " +b);
		
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		
		System.out.println("Value after swapping: ");
		System.out.println("The value of a is: " +a);
		System.out.println("The value of b is: " +b);
	}
}