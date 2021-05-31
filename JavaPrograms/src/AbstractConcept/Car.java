package AbstractConcept;

public interface Car 
{
	// When to use this - Only and only to hide all the implementation logic
	
	// In Interface, Method body is not allowed. Only method declaration
	// All methods are abstract in nature by default
	// Always define only abstract methods, not require abstract method to mention in the method
	// Interface means only prototype, and we achieve 100% abstraction
	// Cannot create the object of interface
	
	// only final and static variables
	
	public void start();
	public void stop();
	public void refuel();	
}