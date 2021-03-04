package synchorization;

public class shop {
	int pno=0;
		synchronized  public void put(int n)
		{
			pno=n;
			System.out.println("\n producer:"+pno);
		}
		synchronized  public void get()
		{
			System.out.println("\n consumer:"+pno);
		}
		 
	
}
