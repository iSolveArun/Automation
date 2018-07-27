package week1_day_2;

import java.util.Scanner;
@SuppressWarnings({"unused"})
public class DataTypeConveryToArray {

	public static void main(String[] args) {

		int[] a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		for (int i = 0; i < a.length; i++)
			System.out.println("Array list is" + i + ":" + a[i]);
	}
}
