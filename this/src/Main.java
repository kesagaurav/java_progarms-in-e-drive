
public class Main {

	private String name;
	private int accno;
	
	
	
	
	
	
	public Main(String name, int accno) {
		super();
		this.name = name;
		this.accno = accno;
	}

	
	public void setbank(String name,int accno) {
		this.name=name;
		this.accno=accno;
	}
	
	
	public void setbank(String name,int accno) {
		System.out.println("\n name="+name +"\n accno="+ accno);
	}
	
	
	
	public static void main(String[] args) {
		
		Main obj=new Main("gaurav1",102);
		//obj.setbank("gaurav", 101);
		System.out.println(obj);
		obj.showbank();

	}

}
