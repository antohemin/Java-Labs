package test;
import java.util.Scanner;

public class exeight {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=s.next().charAt(0);
		int r=(int) ch;
		System.out.println("ASCII value is " + r);
	}

}
