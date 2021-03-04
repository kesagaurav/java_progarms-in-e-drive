
public class main {

	public static void main(String[] args) {
		
		printer prn=new printer();
		computer c1=new computer(prn,"A.java");
		computer c2=new computer(prn,"B.java");
		computer c3=new computer(prn,"C.java");
		try
		{
			c1.t.join();
			c2.t.join();
			c3.t.join();
			
		}
		catch(Exception  e)
		{
			System.out.println("\n error"+e);
		}
		

	}

}
