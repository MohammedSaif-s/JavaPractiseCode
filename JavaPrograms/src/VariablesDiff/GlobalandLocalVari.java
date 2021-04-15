package VariablesDiff;

public class GlobalandLocalVari 
{
	//Global Variable
	int age = 24;
	String name = "SAIF";
	
	public static void main(String[] args) 
	{
		int i = 15;
		System.out.println(i);
		GlobalandLocalVari glvari = new GlobalandLocalVari();
		System.out.println(glvari.age);
		System.out.println(glvari.name);
		glvari.sum();
	}
	
	public void sum()
	{
		int i = 10;
		int j= 20;
		System.out.println(i);
		System.out.println(j);
		
	}
}