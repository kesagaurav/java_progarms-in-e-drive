package thread4;

public class thread  implements Runnable{
	Thread t;

	public thread(String name) {
		t=new Thread(this,name);
		System.out.println("\n child thread created"+t);
		t.start();
	}

	@Override
	public void run() {
		System.out.println("\n child theread starts");
		try
		{
			for(int i=1;i<=5;i++)
				System.out.println("\n child thread"+i);
				Thread.sleep(2000);
		}
		
		catch(Exception e)
		{
			System.out.println("\n error"+e);
		}
			System.out.println("\n child terminates");
	}
	

}
