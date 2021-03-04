
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sample.x=300;
		sample obj2=new sample();
		sample.x=300;
		System.out.println("\n sample.x="+sample.x);
		System.out.println("\n obj2.x="+obj2.x);
		System.out.println("\n after the details of obj1.x");
		obj2.x=200;
		System.out.println("\n sample.x="+sample.x);
		System.out.println("\n obj2.x="+obj2.x);
		
		
	}

}
