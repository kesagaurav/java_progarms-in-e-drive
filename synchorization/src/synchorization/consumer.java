package synchorization;

public class consumer implements Runnable {

	Thread t;
	shop obj1;
	public consumer(shop ob) {
		obj1=ob;
		t=new Thread(this, "consumer");
		t.start();
		
		
	}
		
		public void run()
		{
			try
			{
				for(int i=0;i<=5;i++)
				{
					//obj1.get();
					Thread.sleep(1000);
					
				}
				
			
			}
		
			catch(Exception e)
			{
				System.out.println("\n error:"+e);
			}
		}


}
