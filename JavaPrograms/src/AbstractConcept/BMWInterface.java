package AbstractConcept;

public class BMWInterface implements Car
{
	@Override
	public void start()
	{
		System.out.println("BMW Start");	
	}

	@Override
	public void stop() 
	{
	System.out.println("BMW Stop");		
	}

	@Override
	public void refuel() 
	{
	System.out.println("BMW Refuel");
	}
	
	// Non overridden method
	public void theftSafety()
	{
		System.out.println("Theft is a security");
	}
}