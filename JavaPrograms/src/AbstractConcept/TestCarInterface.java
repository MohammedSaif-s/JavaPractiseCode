package AbstractConcept;

public class TestCarInterface
{
	public static void main(String[] args) 
	{
		BMWInterface b = new BMWInterface();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		
		Car c = new BMWInterface(); // Dynamic polymorphism - where child interface object is referred by the parent interface object reference
		c.start();
		c.stop();
		c.refuel();	
	}
}