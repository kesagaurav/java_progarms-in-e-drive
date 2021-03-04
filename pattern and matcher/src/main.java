import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Pattern pat=Pattern.compile("gaurav");
	Matcher mat=pat.matcher("gaurav");
	System.out.println("\n looking for the string to be matches----------");
	if(mat.find()) System.out.println("subsequence found");
	else System.out.println("\n subsequence not found");
	
	
	}

}
