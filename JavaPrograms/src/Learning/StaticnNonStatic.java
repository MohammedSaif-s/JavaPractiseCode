package Learning;

public class StaticnNonStatic
{
	// Global variables -> the scope of global variables will be available across all the functions with some conditions
	
	static int age = 24;
	String name = "SAIF";

	public static void main(String[] args)
	{
		// calling method directly
		sum();
		// Using classname to call the static method
		StaticnNonStatic.sum();
		System.out.println(age);
		
		//How to call nonstatic variables and class
		StaticnNonStatic obj = new StaticnNonStatic();
		obj.sendMail();
		System.out.println(obj.name);
	}
	public static void sum()
	{
		System.out.println("Sum method");
	}
	public void sendMail() 
	{
		System.out.println("Send Mail method");
	}
}
