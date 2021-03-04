package overloading;

public class bank {

	private String name;
	private int accno;
	public bank() 
	{
		name="A";
		accno=101;
	}
	public bank(String s)
	{
		name=s;
		accno=102;
	}
	public bank(String s, int a) {
		this.name = s;
		this.accno = a;
	}
	
	public void showbank()
	{
		System.out.println("\n name=" +name +"\t accno= "+accno);
	}

}
