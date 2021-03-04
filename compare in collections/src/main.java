import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sobj new=new obj();//
		TreeSet<String> ts=new TreeSet<String> (new compare());
		ts.add("F");
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("G");
		
		for(String elements:ts)
			System.out.println(elements +" ");
		
		System.out.println();

	
	
	}

}
