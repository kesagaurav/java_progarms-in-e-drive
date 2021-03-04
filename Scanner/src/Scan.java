import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		a=sc.nextInt();
		System.out.println("enter a no");
		b=sc.nextInt();
		sc.close();
		c=a+b;
		System.out.println("\t sum of numbers is: " +c);
		
		

	}

}
