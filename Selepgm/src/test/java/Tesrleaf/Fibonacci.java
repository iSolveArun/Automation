package Tesrleaf;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		
		int n,a=0,b=1,c=0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		n=sc.nextInt();
		System.out.println("Fibonacci Series:");
		for(int i=0;i<n;i++)
			{
			a=b;
			b=c;
			c=a+b;

		System.out.println ("fibonacci Series:"+c);
		
	}
	}
}
