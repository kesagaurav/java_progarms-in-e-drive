package locks2;

import java.util.concurrent.locks.ReentrantLock;

public class locks implements Runnable
{
	String name;
	ReentrantLock lock;
	int id;
	Thread t;
	public locks(String n, ReentrantLock lo, int d) {
		this.name = n;
		this.lock = lo;
		this.id = d;
		t=new Thread(this,name);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	try
	{
		System.out.println( name  +"is waiting for a lock");
		System.out.println( id  +"is waiting for a lock");
		lock.lock();
		System.out.println( name  +"is looking for count");
		System.out.println( id  +"is looking for count");
		Shared.count++;
		System.out.println( name  +":" + Shared.count);
		System.out.println( id  +":" +Shared.count);

		System.out.println( name  +"is sleeping");
		System.out.println( id  +"is sleeping");
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
