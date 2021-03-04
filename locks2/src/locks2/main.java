package locks2;

import java.util.concurrent.locks.ReentrantLock;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReentrantLock lock=new ReentrantLock();
		locks l=new locks("A",lock,12);
		locks l1=new locks("B",lock,13);
		locks l2=new locks("C",lock,14);
		
		
	
	
	}

}
