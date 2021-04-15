package Learning;

public class MethodOverloading
{
	int x;
	public static void main(String[] args) 
	{
		// MethodOverloading, where the method name is same but with diff arguments / input paramaters 
		// Duplicate method is not allowed, if the parameter also having same
		// Duplicate method with diff datatype in the parameter is allowed

		MethodOverloading mo = new MethodOverloading();
		mo.sum();
		mo.sum(5);
		mo.sum(10, 20);
	}

	public void sum ()
	{
		System.out.println("Method 1");
	}

	public void sum(int a)
	{
		System.out.println("Method 2");
		System.out.println(a);
	}

	public void sum(int a, int b)
	{
		System.out.println("Method 3");
		System.out.println(a+b);
	}
}