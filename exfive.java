package test;
import java.util.Scanner;

public class exfive {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the alphabet");
		char a = s.next().charAt(0);
		if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u'))
				System.out.println("The entered alphabet is a vowel");
		else
			System.out.println("The entered alphabet is a consonant");
	}

}
