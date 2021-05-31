package AbstractConcept;

public class TestBank 
{
	public static void main(String[] args) 
	{
		HDFCBank hdfc = new HDFCBank();
		hdfc.loan();
		hdfc.debit();
		hdfc.credit();
		hdfc.otherLogic();
		
		Bank b = new HDFCBank();
		b.loan();
		b.credit();
		b.debit();
	}
}