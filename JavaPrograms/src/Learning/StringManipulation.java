package Learning;

import java.util.Arrays;

public class StringManipulation	// Manipulating the strings
{
	public static void main(String[] args) 
	{
		// String is a collection of different characters
		String str = "This is Mohammed saif";
		String str1 = "This is Mohammed Saif";
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s',str.indexOf('s')+1));
		System.out.println(str.indexOf('s', str.indexOf('s', str.indexOf('s')+1)+1));
		System.out.println(str.indexOf("Mohammed"));
		System.out.println(str.indexOf("Hello"));
		
		// String Comparison
		System.out.println(str.equals(str1)); // equals() method should be used for content comparison, == sign checks if both references points to the same location or not
		System.out.println(str.equalsIgnoreCase(str1));
		
		// Sub string
		System.out.println(str.substring(0, 9));

		//trim - only used for before space and after space in a given string
		String s = "   The Wall  ";
		System.out.println(s.trim());
		
		//replace
		System.out.println(s.replace(" ", ""));
		
		//replaceAll
		System.out.println(s.replaceAll("\\s+", ""));
		
		String date = "01-01-2020";
		System.out.println(date.replace("-", "/"));
		
		//split
		String s1 = "Hello_World_Selenium";
		String stri[] = s1.split("_");
		for (int i=0; i<stri.length; i++)
		{
			System.out.println(stri[i]);
		}
		
		String st1 = "Hello";
		String st2 = "Welcome";
		int a = 100;
		int b = 200;
		System.out.println(st1 + st2 + a + b);
		System.out.println(a + b + st1 + st2);
		System.out.println(st1 +st2 +(a+b));		
		
		String vowels = "a::e::i::o:e";
		String[] result = vowels.split("::"); 
		System.out.println("result = " + Arrays.toString(result));
	}
}