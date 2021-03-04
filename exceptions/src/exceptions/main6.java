package exceptions;

import java.util.Scanner;

public class main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=divide();
		System.out.println(result);
	}

	private static int divide() {
		// TODO Auto-generated method stub
		
		int x=getInt();
		int y=getInt();
		//String ;
		System.out.println(" x is "   +   x  +  "y   is "   +  y);
		return x/y;
		
		}

	private static int getInt() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("\n plz entre an value");
		return s.nextInt();

	}

}
