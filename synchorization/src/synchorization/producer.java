package synchorization;

public class producer implements Runnable {

	Thread t;
	shop obj;
	public producer(shop ob) {
		obj=ob;
		t=new Thread(this,"producer");
		t.start();
		
		
	}
		public void run()
		{
			try
			{
				for(int i=0;i<=5;i++)
				{
					Thread.sleep(1000);
					 //obj.put(i);
				}
			}
			catch(Exception e)
			{
				System.out.println("\n error:"+e);
			}
		}

}
