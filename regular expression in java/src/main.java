import java.util.regex.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="my name is gaurav";
		System.out.println(str);
		String str1=str.replaceAll("gaurav", "deepa");
		System.out.println(str1);
		String str2="the buffalo  gives milk";
		System.out.println(str2);
		String str3=str2.replaceAll("buffalo", "cow");
		System.out.println(str3);
		String  alphanumeric="abc123456789";
		System.out.println(alphanumeric.replaceAll("abc", "0"));
		System.out.println(alphanumeric.replaceAll("[1-9]", "a"));
		String  alphanumeric1="abc+123*456/789&@";
		System.out.println(alphanumeric1.replaceAll("[+*/&@]", ""));
		
		String  alphanumeric2="abc+123*456/789&@?><.;";
		
		System.out.println(alphanumeric2.replaceAll("[+*/&@?<>.;]", ""));
	
	}

}
