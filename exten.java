package test;
import java.util.Scanner;

public class exten {
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the first number");
	int a= s.nextInt();
	System.out.println("Enter the second number");
	int b=s.nextInt();
	System.out.println(" Before Swapping a = "+a+" and b = "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(" After Swapping a = "+a+" and b = "+b);
}
}
