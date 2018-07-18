package Tesrleaf;

import java.util.Scanner;

public class divisiblefive {

	public static void main(String[] args){
		
		int i=5,num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value: ");
		num=scan.nextInt();
		if(num%i==0)
		{
		System.out.println("Given number is divisiable by five");
		}
		else{
			System.out.println("Given number is not divisiable by five");
		}
		
	}
	
}
