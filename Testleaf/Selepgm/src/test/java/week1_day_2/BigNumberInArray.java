package week1_day_2;

import java.util.Scanner;

public class BigNumberInArray {

	public static void main(String[] args) {

		int number, temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the values:");
		number = input.nextInt();
		int a[] = new int[number];
		System.out.println("Enter no of element:");
		for (int i = 0; i <number; i++) {
			a[i] = input.nextInt();
		}
		for (int i = 0; i < number; i++)

		{
			for (int j = i + 1; j < number; j++)
			{
				if (a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Ascending Order:");
		for (int i = 0; i < number - 1; i++)
		{
			System.out.print(a[i] + ",");
		}
		System.out.print(a[number - 1]);
	}
}
