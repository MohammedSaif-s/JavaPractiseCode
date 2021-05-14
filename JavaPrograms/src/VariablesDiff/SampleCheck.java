package VariablesDiff;

import java.util.ArrayList;
import java.util.Scanner;

public class SampleCheck
{
	public static void main(String[] args) throws Exception 
	{
		Scanner takeInput = new Scanner(System.in); // Scanner is a class which can parse primitive types and Strings using regular expressions
		int testCase = 0; 
		testCase = takeInput.nextInt();
		takeInput.nextLine();

		ArrayList<String> arrList = new ArrayList<String>();
		String temp;
		for (int i=0; i<testCase; i++)
		{
			temp = takeInput.nextLine();
			arrList.add(temp);
		}

		for (int i=0; i<arrList.size(); i++)
		{
			if ((arrList.get(i).contains("a") && arrList.get(i).contains("e") && arrList.get(i).contains("i") && arrList.get(i).contains("o") && arrList.get(i).contains("u"))
				|| (arrList.get(i).contains("A") && arrList.get(i).contains("E") && arrList.get(i).contains("I") && arrList.get(i).contains("O") && arrList.get(i).contains("U")))
				{
					System.out.println("lovely string");
				}
			else
				System.out.println("ugly string");
		}
	}
}