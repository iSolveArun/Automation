package Tesrleaf;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		
		int i,n,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Number should be non-negative");
		}
		else
		{
			for(i=1;i<=n;i++)
				fact=fact*i;
		}
		System.out.println("Factorial is = "+fact);
		}

	}

