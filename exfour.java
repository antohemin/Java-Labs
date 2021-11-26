package test;

import java.util.Scanner;

public class exfour {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("====================================");
		System.out.println("            Calculator              ");
		System.out.println("====================================");
		System.out.println("Enter the first number");
		int a =s.nextInt();
		System.out.println("Enter the second number");
		int b= s.nextInt();
		System.out.println("Enter the operation to be performed");
		System.out.println("a. ADDITION");
		System.out.println("b. SUBSTRACTION");
		System.out.println("c. DIVISION");
		System.out.println("d. MULTIPLICATION");
		char r= s.next().charAt(0);
		switch(r)
		{
		case 'a':
		{ 
			int k=a+b;
			System.out.println(" Sum of a = "+a+" and b = "+b+ " is  "+k);
			break;
		}
		case 'b':
		{ 
			int k=a-b;
			System.out.println(" Difference between a = "+a+" and b = "+b+ " is  "+k);
			break;
		}
		case 'c':
		{ 
			int k=a/b;
			System.out.println(" Division of a = "+a+" and b = "+b+ " is  "+k);
			break;
		}
		case 'd':
		{ 
			int k=a*b;
			System.out.println(" Multiplication of a = "+a+" and b = "+b+ " is  "+k);
			break;
		}
		default:
			System.out.println(" Wrong Input ");
			break;
		
		}
		
	}
}
