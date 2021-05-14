package Learning;

public class RemoveJunkorSpecialChars 
{
	public static void main(String[] args) 
	{
		//question:- How will I remove junk characters / unwanted characters 
		
		String str = "#!Learning ### Sele@@@nium &&&&& Java";

		// Using replaceAll method as regular expression to remove any kind of special characters as per user need
		//Regular Expression: [^a-zA-Z0-9]
		
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		
		String str1 = " Learning Selenium WebDriver With Java ";
		str1 = str1.replaceAll("\\s+", "");
		System.out.println(str1);
	}
}