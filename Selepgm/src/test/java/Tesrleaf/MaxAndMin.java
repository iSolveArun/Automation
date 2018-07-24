package Tesrleaf;

import java.util.Scanner;
public class MaxAndMin {
		
	public static void main(String[] args) {
			
			int n,temp;
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the no of element: ");
			n=scan.nextInt();
			int a[]= new int[n];
			System.out.println("Enter the all the element: ");
			for(int i=0;i<n;i++)
			{
				a[i]=scan.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]>a[j])
					{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
				}
			}
			System.out.println("First largest number is:"+a[n-1]);
			System.out.println("Second largest number is:"+a[n-2]);
			System.out.println("Thired largest number is:"+a[n-3]);
			System.out.println("First Smallest element is:"+a[0]);
			System.out.println("Second Smallest element is:"+a[1]);
		}
	}
	
	

