package week1_day_2;

import java.util.Scanner;

public class MaxAndMinNumberInArray {

	public static void main(String[] args) {

		int number,temp;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the value:");
		number= input.nextInt();
		System.out.println("Enter the no of element");
		int a[]= new int[number];
		for(int i=0;i<number;i++)
		{
			a[i]=input.nextInt();
		}
		for(int i=0;i<number;i++)
		{
			for(int j=i+1;j<number;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("The biggest number is:"+a[number-1]);
		System.out.println("The Secound biggest number is:"+a[number-2]);
	}
}
