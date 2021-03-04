package locks1;

import java.util.concurrent.locks.ReentrantLock;

public class LockThread implements Runnable {

	String name;
	ReentrantLock lock;
	Thread t;
	
	LockThread(ReentrantLock k,String n)
	{
		name=n;
		lock=k;
		t=new Thread(this,n);
		t.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println("starting"+name);
	try
	{
		System.out.println(name +" is waiting for a lock");
		lock.lock();
		System.out.println(name + " is locking count");
		Shared.count++;
		System.out.println(name + ":"+ Shared.count);
		System.out.println(name + " is sleeping");
		Thread.sleep(1000);
		
}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	finally
	{
		System.out.println( name +" is unlocking count");
		lock.unlock();
	}
	
	}
	

}
