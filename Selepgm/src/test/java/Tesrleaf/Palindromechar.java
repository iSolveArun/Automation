package Tesrleaf;

import java.util.Scanner;

public class Palindromechar {

	public static void main (String args[]) {
		
		String original, reverse =" ";
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter a string to check if it is a palindrome");
	    original = in.nextLine();
		int length = original.length();
		
		 for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + original.charAt(i);
			
		if(original.equalsIgnoreCase(reverse))
		{
			System.out.println("Given chacaters is Palindrome");
		}
		else 
		{
			System.out.println("Given chacaters is not Palindrome");
		}

	}
	
}
