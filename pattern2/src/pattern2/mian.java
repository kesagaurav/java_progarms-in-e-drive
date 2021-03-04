package pattern2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mian {

	public static void main(String[] args) {
	

		String str="gaurav";
		 char c='a';
		System.out.println(count(str,c));
	
	}

	private static int count(String s,char ch)
		{
			Pattern pat=Pattern.compile(String.valueOf(ch));
			Matcher mat=pat.matcher(s);
			int res=0;
			while(mat.find())
				res++;
			return res;
			
		}

}