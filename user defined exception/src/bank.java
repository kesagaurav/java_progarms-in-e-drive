
public class bank {
	private String name;
	private int accno;
	private double bal;
	public void createaccount(String n,int a,double amt) throws Exception
	{
		try
		{
		if(amt<1000)
			throw new Exception("minumum deposit is 1000");
		name=n;
		accno=a;
		bal=amt;
		
	}
	
		catch(Exception e)
		{
			System.out.println("\n error"+e);
		}
	
	}

	public void showaccount()
	{
		System.out.println("\n name="+name+" accno="+accno+" bal="+bal);
	}
}