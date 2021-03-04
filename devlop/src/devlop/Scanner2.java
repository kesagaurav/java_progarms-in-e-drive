package devlop;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no");
	a=sc.nextInt();
	System.out.println("enter a no");
	b=sc.nextInt();
	sc.close();
	c=a*b;
	System.out.println("\t mul of 2 nos :" +c);
}
}
