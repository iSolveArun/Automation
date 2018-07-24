package Tesrleaf;

import java.util.Scanner;

public class twotable {
	
	public static void main(String[] args) {
		
		int i,num;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		num=sc.nextInt();
		int a[] = new int[10];
		for(i=1;i<=10;i++)
		{
			a[i-1]=i*num;	
			
		System.out.println("order is :"+num+ "* "+i+" = "+a[i-1]);
		
		}
		for(int j=a.length-1;j>0;j--)	{
			System.out.println("Reverse order is:"+num+ "* "+j+" ="+a[j]);
		}
	}
}
