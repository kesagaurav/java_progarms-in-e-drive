package thread3;

public class userthread extends Thread {

	public userthread(String name)
	{
		super(name);
		System.out.println("\n child thread created:"+this);
		start();
		
	}

	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("\n child thread starts");
		try
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println("\n child thread"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("\n error"+e);
		}
			System.out.println("\n child thread terminates and i woke up");
			
	}
		
}
