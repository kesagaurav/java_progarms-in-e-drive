
public class bank {
	
	private String name;
	private int accno;
	
	public bank(String s,int a) 
	{
		name=s;
		accno=a;
		
	}
	public void showbank()
	{
		System.out.println("\n name="+name+"\taccno="+accno);
	}

}
