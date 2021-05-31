package OtherConcept;

//Thread Class vs Runnable Interface
//If we extend the Thread class, our class cannot extend any other class
//because Java doesn’t support multiple inheritance.
//But, if we implement the Runnable interface, our class can still extend other base classes.

class MultiThreadingDemo implements Runnable //extends Thread // 
{
	public void run ()
	{
		try
		{
			System.out.println("Thread is " + Thread.currentThread().getId()+ " is running");
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught");
		}
	}
}
public class MultiThreadingJavaConcepts
{
	public static void main(String[] args) 
	{
		int num=8;
		for (int i=0; i<num; i++)
		{
//			MultiThreadingDemo demo = new MultiThreadingDemo();
//			demo.start();
			Thread thread = new Thread (new MultiThreadingDemo());
			thread.start();
		}
	}
}