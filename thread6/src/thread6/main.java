package thread6;

public class main {

	public static void main(String[] args) {
		System.out.println("\n main thread starts");
		my obj=new my("first");
		my obj1=new my("second");
		my obj2=new my("third");
		System.out.println("\n obj isAlive:"+obj.t.isAlive());
		System.out.println("\n obj1 isAlive:"+ obj1.t.isAlive());
		System.out.println("\n  obj2.isAlive:"+obj2.t.isAlive());
		try
		{
			obj.t.join();
			obj1.t.join();
			obj2.t.join();
			
		}
		catch(Exception e)
		{
			System.out.println("\n error"+e);
		}
		System.out.println("\n obj isAlive:"+obj.t.isAlive());
		System.out.println("\n obj1 isAlive:"+ obj1.t.isAlive());
		System.out.println("\n  obj2.isAlive:"+obj2.t.isAlive());
		

	}

}
