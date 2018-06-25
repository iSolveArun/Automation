package Demosele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * Here we will learn to connect to Oracle DB using JDBC Driver.
 */
public class mysqll {
	public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    System.out
		        .println("Please provide below details to connect Oracle Database");
		    System.out.println("Enter Database");
		    String dbName = scanner.next();
		    System.out.println("Enter UserName");
		    String userName = scanner.next();
		    System.out.println("Enter Password");
		    String password = scanner.next();
		    try {
		      Class.forName("oracle.jdbc.driver.OracleDriver");
		    } catch (ClassNotFoundException e) {
		      e.printStackTrace();
		    }
		    Connection connectionn= null;
		    try {
		    	DriverManager.registerDriver( new oracle.jdbc.driver.OracleDriver());
		    	Connection connectionn1 = DriverManager.getConnection("jdbc:oracle:thin:@172.16.2.190:1521:" +"iflow_ckyc_pfi", "swteam","iSolve123$");

		    } catch (SQLException e) {
		      e.printStackTrace();
		    }
		    if (connectionn!= null) {
		      System.out.println("nSuccessfullly connected to Oracle DB");
		    } else {
		      System.out.println("nFailed to connect to Oracle DB");
		    }
		  }

}


