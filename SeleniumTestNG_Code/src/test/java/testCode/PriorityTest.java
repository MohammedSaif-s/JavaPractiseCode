package testCode;

import org.testng.annotations.Test;

public class PriorityTest 
{
	@Test(priority=0)
	public void sampleTest2() 
	{
		System.out.println("Test this app2");
	}	
	
	@Test()
	public void sampleTest1() 
	{
		System.out.println("Test this app1");
	}
	
	@Test(priority=-1)
	public void sampleTest3() 
	{
		System.out.println("Test this app3");
	}
	
	@Test(priority=1)
	public void sampleTest4() 
	{
		System.out.println("Test this app4");
	}	
}