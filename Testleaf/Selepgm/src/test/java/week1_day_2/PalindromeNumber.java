package week1_day_2;

import java.util.Scanner;

import org.apache.tools.ant.util.SymbolicLinkUtils;

public class PalindromeNumber {

	
	public static void main(String[] args) {
		
		int num,a,b,temp=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enthr the value:");
		num=input.nextInt();
		b=num;
		while(num>0)
		{
			a=num%10;	
			num=num/10;
			temp=temp*10+a;
		}
		if(temp==b)
		{
			System.out.println("Given number is Palindrome");
		}
		else
		{
			System.out.println("Given number is not Palindrome");
		}

	}

}
