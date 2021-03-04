package threadpool2;

public class Myclass implements Runnable {
	public String name;

	public Myclass(String s) {
		this.name=s;
	}



	@Override
	public void run() {
		
       
		System.out.println(Thread.currentThread().getName()+" Start and message is: " +name);  
        	processgaurav();//call processmessage method that sleeps the thread for 2 seconds  
		 System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name  
			
		
	}
		public void processgaurav()
		{
	        try { 
	        	Thread.sleep(2000);  
	        	} 
	        catch (Exception e) 
	        { 
	        	e.printStackTrace(); 
	        	}  

		}

}
