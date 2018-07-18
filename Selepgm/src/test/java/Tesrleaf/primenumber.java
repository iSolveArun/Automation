package Tesrleaf;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {

		int num, count = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("Given number is pirme");
		} else

		{
			System.out.println("Given number is not prime");
		}
	}
}