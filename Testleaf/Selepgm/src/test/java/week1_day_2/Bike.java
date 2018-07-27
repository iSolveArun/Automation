package week1_day_2;

import org.testng.reporters.jq.Main;

public class Bike	 {

	 int Serialno;
	 String name ;
	 String color;
	Bike(int s,String n){
		
	Serialno=s;
	name =n;
	}
	
	Bike(int s,String n,String c){
		
		Serialno=s;
		name =n;
		color=c;
		}
	
	public void display()
		
		{
			System.out.println(Serialno+" "+name+" "+color);
		}
	
	public static void main(String args[]){  
		Bike b1= new Bike(123456,"FZ");
		Bike b2= new Bike(1234567,"Pulsar");
		Bike b3= new Bike(12345678,"Hero","Green");
		b1.display();
		b2.display();
		b3.display();
		}
	
	}




