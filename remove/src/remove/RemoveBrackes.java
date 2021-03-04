package remove;

import java.util.Scanner;

public class RemoveBrackes {

	public static void main(String[] args) {
		 System.out.println("Enter the string…");
	       Scanner sc = new Scanner(System.in);
	       String input = sc.nextLine();
	       String result = input.replaceAll("[()]", "");  // Replacing the brackets with “”
	       sc.close();
	       System.out.println(result);

	}

}
