package test;
import java.util. Scanner;


public class exthree {
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		String r=(n%2==0)?"even":"odd";
		System.out.println(r);
		
		
	}}