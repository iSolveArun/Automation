package week1_day_2;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
	
	int num,fact=1;
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	System.out.println("Enthe the value:");
	num=input.nextInt();
	
	for(int i=1;i<=num;i++)
	{
	
		fact =fact*i;
	}
		System.out.println("Factorial is :" +fact);
	
	}

}