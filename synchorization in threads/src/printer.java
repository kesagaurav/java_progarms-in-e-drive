
public class printer {
	
	public void print(String name)
	{
		System.out.println("\n printing........"+name);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception  e)
		{
			System.out.println("\n error"+e);
		}
			System.out.println("\n completed .............."+name);
	}

}
