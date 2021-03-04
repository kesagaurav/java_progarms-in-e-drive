package thread5;

public class thread implements Runnable {
	Thread t;
	String threadname;
	public thread(String name) {
		
		t=new Thread(this,name);
		threadname=name;
		System.out.println("\n thread created:"+threadname);
		t.start();
	}
	@Override
	public void run() {
		System.out.println("\n thread started:"+threadname);
		try
		{
			for(int i=1;i<=5;i++)
				System.out.println("\n  threadname"+i);
				Thread.sleep(2000);
		}
		
		catch(Exception e)
		{
			System.out.println("\n error"+e);
		}
			System.out.println("\n thread terminates"+threadname);
		
	}
	

}
