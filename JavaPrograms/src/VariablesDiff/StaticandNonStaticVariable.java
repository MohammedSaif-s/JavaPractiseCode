package VariablesDiff;

public class StaticandNonStaticVariable 
{
	// Global variable 
	int age = 20;
	static String name = "SAIF";
	
	public static void main(String[] args) 
	{
		sum();
		System.out.println(name);
		
		StaticandNonStaticVariable snsv = new StaticandNonStaticVariable();		
		System.out.println(snsv.age);
		snsv.sendMail();
	}
	
	public void sendMail()
	{
		System.out.println("Mail Method");
	}
	
	public static void sum()
	{
		System.out.println("Sum Method");
	}
}