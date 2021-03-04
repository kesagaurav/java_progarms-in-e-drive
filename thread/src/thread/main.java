package thread;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n hello from computer");
		Thread obj=new AnthorThread();
		obj.start();
		new Thread()
		{
			public void run()
			{
				System.out.println("\n hello from anamous class");
			}
		
	}.start();

		System.out.println("\n heelo");
	}
}
