package test;
import java.util. Scanner;


public class extwo {
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the the number32");
		int n=s.nextInt();
		if(n%2==0)
			System.out.println("the number is even");
		else
			System.out.println("The number is odd");
	}

}
