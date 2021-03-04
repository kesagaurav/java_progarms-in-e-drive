package array1;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements you want the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("\nenter the elemets u wnat to input");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			a[i]++;
			
		}
		System.out.print("Elements of array after decrement by 1:");
		for(i=0;i<n-1;i++)
		{
			System.out.println(a[i]+",");
		}
		 System.out.println(a[n-1]);
		 sc.close();
	}
		
}
