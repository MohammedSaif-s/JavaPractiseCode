package OtherConcept;

import java.util.Scanner;

public class RecursionProcess
{  
	// 2. With recursive function- Recursion means, a Function is calling itself inside the method/ function body
	 public static int factorial(int n)
	 {    
		 if (n == 0)    
			 return 1;    
		 else    
			 return(n * factorial(n-1));    
	 }    
	 public static void main(String args[])
	 {  
		 int fact=1; 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the number: ");
		 int number = scan.nextInt();
		 fact = factorial(number);   
		 System.out.println("Factorial of "+number+" is: "+fact);    
	 }  
}