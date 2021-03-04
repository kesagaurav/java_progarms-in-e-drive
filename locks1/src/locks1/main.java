package locks1;

import java.util.concurrent.locks.ReentrantLock;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReentrantLock lock=new ReentrantLock();
		LockThread a = new LockThread(lock,"A");
		LockThread b=  new	LockThread(lock,"B"); 
		
		
		
		
	
	}

}
