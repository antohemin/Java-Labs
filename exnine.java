package test;
import java.util.Scanner;

public class exnine {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a =s.nextInt();
		System.out.println("Enter the second number");
		int b =s.nextInt();
		System.out.println("Before swapping a = "+a+" and b = "+b);
		int temp =a;
		a=b;
		b=temp;
		System.out.println("After swapping a = "+a+" and b = "+b);
	}

}
