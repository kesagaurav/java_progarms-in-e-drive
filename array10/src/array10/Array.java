package array10;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int n = 0,sum=0;
	System.out.println("\n enter nos U want to input");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	System.out.println("\n enter nos");
	int a[]=new int [n];

	for(int i=0;i<n;i++) {
		a[i]=s.nextInt();
	}
	for(int i=0;i<n;i++) {
		sum+=a[i];
	}
	System.out.println(sum);
	
	}

}
