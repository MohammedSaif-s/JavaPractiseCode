package AbstractConcept;

public abstract class Bank
{
	// partial abstraction
	// hiding the implementation logic - Abstraction (OOPS Concept)
	// Abstract class can have both abstract and non-abstract methods
	// Cannot create the object of abstract classes
	// performance is better than interface
	
	public abstract void loan();
	
	// Non abstract Method
	public void debit()
	{
		System.out.println("Debit Amount");
	}
	
	public void credit()
	{
		System.out.println("Credit Amount");
	}
}
