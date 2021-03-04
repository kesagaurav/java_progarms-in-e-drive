import java.util.*;
public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.add("F");
		ll.add("E");
		ll.add("B");
		ll.add("G");
		ll.add("D");
		ll.addFirst("A");
		ll.addLast("Z");
		ll.add(1,"B1");
		System.out.println("\n original contents are"+ll);
		ll.remove("F");
		ll.remove("3");
		System.out.println("\n after deletion the elements are"+ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println("\n after deleting first and second"+ll);
		Object val=ll.get(2);
		ll.set(2, (String) val+"changed");
		System.out.println("\n ll after change"+ll);
		
	
	
	
	}

}
