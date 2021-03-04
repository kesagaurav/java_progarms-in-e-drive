package pattern3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern pat=Pattern.compile("[a-z]+");
		Matcher mat=pat.matcher("this is my test and my name is gaurav");
		while(mat.find())
			System.out.println("Match :"+mat.group());
	
	
	
	}

}
