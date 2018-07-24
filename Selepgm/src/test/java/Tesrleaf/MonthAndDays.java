package Tesrleaf;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MonthAndDays {
	
	public static void main(String[] args) {
		
		int mon;
	    String[] months = {
	      "January", "February", "March", "April", "May", "June", "July",
	      "August", "September", "October", "November", "December"};
	    
	    @SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);

	    System.out.print("Enter a Month [1-12]:");
	    mon=input.nextInt();
	    
	    mon = mon - 1;
	    
	    Calendar cal = new GregorianCalendar();
	    cal.set(Calendar.MONTH,mon);
	    
	    int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	    
	    System.out.println("There are " + days + " days in " + months[mon]); 
	}
	

}
