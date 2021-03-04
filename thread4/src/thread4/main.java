package thread4;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n main thread starts");
		thread obj=new thread("gaurav");
		try
		{
			for(int i=1;i<=5;i++)
				System.out.println("\n main thread "+i);
				Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("\n error"+e);
		}
		System.out.println("\n main thread terminates and i woke up");
	}

}
