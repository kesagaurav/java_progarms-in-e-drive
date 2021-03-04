
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="World Wide Web";
		System.out.println(text);
		String acronym="";
		for(char c:text.toCharArray())
			if(Character.isUpperCase(c))
				acronym+=c;

		System.out.println(acronym);
	}

}
