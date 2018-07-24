package week1_day_2;

import java.util.Scanner;

public class FiveTable {

	public static void main(String[] args) {

		int as, b;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number1:");
		as = input.nextInt();
		System.out.print("Enter the Number2:");
		b = input.nextInt();
		int a[] = new int[10];
		for (int i = 1; i <= b; i++) {
			a[i] = i * as;

			System.out.println("Multiple is :" + as + " *" + i + "=" + a[i]);
		}
	}
}