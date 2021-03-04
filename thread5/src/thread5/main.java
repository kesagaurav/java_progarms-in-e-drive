package thread5;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("\n main thread starts");
			thread obj=new thread("first");
			thread obj1=new thread("second");
			thread obj2=new thread("third");
			try
			{
				System.out.println("\n main thread suspending");
				Thread.sleep(1000);
				System.out.println("\n main thread resumed");
			}
			catch(Exception e)
			{
				System.out.println("\n error"+e);
			}
			System.out.println("\n main thread terminates");
	
	}

}
