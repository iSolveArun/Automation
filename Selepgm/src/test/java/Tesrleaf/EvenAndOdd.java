package Tesrleaf;

import java.util.Scanner;

public class EvenAndOdd {
	
	public static void main(String[] args) {
		
		int num;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value is :");
		num=sc.nextInt();
		if(num%2==0)
		{
		System.out.println("Given values is even");
		}
		else
		{
		System.out.println("Given values is odd");
		}
	}

}
