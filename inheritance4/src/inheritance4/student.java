package inheritance4;

public class student {
	private String name;
	private int rn;
	private int id;
	public student(String s,int r,int i) {
		name=s;
		rn=r;
		id=i;
		
	}
	public void showstudent()
	{
		System.out.println("\n name= "+name +"\t rn= "+rn +"\t id= "+id);
	}

}
