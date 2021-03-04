import java.util.regex.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Pattern pat;
			Matcher mat;
			boolean found;
			pat=Pattern.compile("java");
			mat=pat.matcher("java");
			found=mat.matches();
			System.out.println("\n testing java against java");
			if(found)
				System.out.println("\n matches");
			else
				System.out.println("\n not matches");
			System.out.println();
			System.out.println("\n testinh Java against ajavba 7");
			mat=pat.matcher("ajavba,7");
			found=mat.matches();
			if(found)
				System.out.println("\n matches");
			else
				System.out.println("\n not matches");
			
	
	}

}
