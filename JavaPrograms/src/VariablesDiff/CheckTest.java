package VariablesDiff;

import java.util.Arrays;

public class CheckTest 
{
	public static void main(String[] args) 
	{
		String inputList[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		System.out.println("***** Input List *********");
		showList(inputList);
		
		Arrays.sort(inputList);
		System.out.println("**** Sorted List *******");
		showList(inputList);
		
		System.out.println("******* Sorted List Case Sensitive **********");
		Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);
		showList(inputList);
	}

	public static void showList(String[] inputList) 
	{
		for (String str : inputList)
			System.out.print(str + " ");
		System.out.println();
		
	}
}