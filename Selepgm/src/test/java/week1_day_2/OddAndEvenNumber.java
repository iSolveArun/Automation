package week1_day_2;

import java.util.Scanner;

public class OddAndEvenNumber {

	public static void main(String[] args) {

		int num, i, j;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value:");
		num = input.nextInt();
		int a[] = new int[10];
		System.out.println("Enter the no of element:");
		for (i = 0; i < num; i++) {
			a[i] = input.nextInt();
		}
		for (i = 0; i < num; i++) {
			if (a[i] % 2 != 0) {
				System.out.println("Given value is odd:" + a[i]);
			}
		}
		for (j = 0; j < num; j++) {
			if (a[j] % 2 == 0) {
				System.out.println("Given value is even:" + a[j]);
			}
		}
	}
}
