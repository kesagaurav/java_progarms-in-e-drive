package thread2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n main thread starts");
		Thread t=Thread.currentThread();
		System.out.println("\n Main thread details: "+ t);
		System.out.println("\n Thread name:"+t.getName());
		System.out.println("\n Priority number:"+t.getPriority());
		t.setName("gaurav");
		t.setPriority(7);
		System.out.println("\n thread details ater change");
		System.out.println("\n Thread name:"+t.getName());
		System.out.println("\n Priority number:"+t.getPriority());
			try
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println("\n main thread:"+i);
					Thread.sleep(1000);
					}
			}
			catch(Exception e)
			{
				System.out.println("\n error"+e);
			}
	
			System.out.println("\n main thread terminates");
	}

}
