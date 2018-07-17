package Testleaf;

import java.util.Scanner;

public class max{

	public void  Additionpgm() {
	
	int a,b,c;
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	System.out.print("Enthe the first number: ");
	a=scan.nextInt();
	System.out.print("Enthe the first number: ");
	b=scan.nextInt();
	c =a+b;
	System.out.println("Sum of the number: "+c);
	
}
	public void  Subtration() {

		int a,b,c;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enthe the first number");
		a=scan.nextInt();
		System.out.println("Enthe the first number");
		b=scan.nextInt();
		c =a-b;
		System.out.println("Sum of the number:"+c);
	}
		public static void main(String[] args) {
			max m  = new max();
			m.Additionpgm();
			m.Subtration();	
			
		}
	}

