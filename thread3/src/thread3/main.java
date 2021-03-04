package thread3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n main thread startted");
		userthread obj=new userthread("gaurav");
		try
		{
			for(int i=0;i<=5;i++)
				System.out.println("\n main"+i);
				Thread.sleep(2000);
		}
		
		catch(Exception e)
		{
			System.out.println("\n error"+e);
		}
			System.out.println("\n main thread terminates and i woke up");
			
			
	
	}

}
