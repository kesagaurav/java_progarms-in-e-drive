import java.util.Comparator;

public class compare implements Comparator<String> {

	@Override
	public int compare(String a, String b) {
		String s1,s2;
		s1=a;
		s2=b;
		return s1.compareTo(s2);
				
		
		}
	

}
