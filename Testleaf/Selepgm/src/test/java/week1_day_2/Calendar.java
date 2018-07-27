package week1_day_2;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		String month_name = "";
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the month number:");
		int month = input.nextInt();
		int days_in_month = 0;
		switch (month) {

		case 1:
			month_name = "January";
			days_in_month = 31;
			System.out.println("Current month is" + " " + month_name + " days" + " " + days_in_month);
			break;
		case 2:
			month_name = "February";
			days_in_month = 29;
			System.out.println("Current month is" + " " + month_name + " days" + " " + days_in_month);
			break;
		case 3:
			month_name = "March";
			days_in_month = 31;
			System.out.println("Current month is" + " " + month_name + " days" + " " + days_in_month);
			break;
		case 4:
			month_name = "April";
			days_in_month = 30;
			System.out.println("Current month is" + " " + month_name + " days" + " " + days_in_month);
			break;
		case 5:
			month_name = "May";
			days_in_month = 31;
			System.out.println("Current month is" + " " + month_name + " days" + " " + days_in_month);
			break;
		case 6:
			month_name = "June";
			days_in_month = 30;
			System.out.println("Current month is" + " " + month_name + " days" + " " + days_in_month);
			break;
		case 7:
			month_name = "July";
			days_in_month = 31;
			System.out.println("Current month is" + " " + month_name + " days" + " " + days_in_month);
			break;
		case 8:
			month_name = "August";
			days_in_month = 31;
			System.out.println("Current month is" + " " + month_name + " days" + " " + days_in_month);
			break;
		case 9:
			month_name = "September";
			days_in_month = 30;
			System.out.println("Current month is" + " " + month_name + " days" + " " + days_in_month);
			break;
		case 10:
			month_name = "October";
			days_in_month = 31;
			System.out.println("Current month is" + " " + month_name + " days" + " " + days_in_month);
			break;
		case 11:
			month_name = "November";
			days_in_month = 30;
			System.out.println("Current month is" + " " + month_name + " days" + " " + days_in_month);
			break;
		case 12:
			month_name = "December";
			days_in_month = 31;
			System.out.println("Current month is" + " " + month_name + " days" + " " + days_in_month);
			break;
		default:
			System.out.println("invalid Month number. \nPlease try again ....\n");
			break;
		}
	}
}
