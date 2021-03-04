package interface3;

public class class3  extends math implements inter1{
	public void mul(int x,int y)
	{
		System.out.println("\n mul="+(x*y));
	}

	@Override
	public void sum(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("\n sum="+(x+y));
	}

}
