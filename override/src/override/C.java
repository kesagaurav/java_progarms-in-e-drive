package override;

public class C extends B 
{
	public void square(int x)
	{
		System.out.println("\n square="+(x*x));
	}

	public void triangle(int a,int b,int c)
	{
		System.out.println("\n triangle="+(a*b*c*1/2));
	}

	@Override
	public void mult(int x, int y) {
		// TODO Auto-generated method stub
		super.mult(x, y);
	}

	@Override
	public void div(int x, int y) {
		// TODO Auto-generated method stub
		super.div(x, y);
	}

	@Override
	public void sum(int x, int y) {
		// TODO Auto-generated method stub
		super.sum(x, y);
	}

	@Override
	public void sub(int x, int y) {
		// TODO Auto-generated method stub
		super.sub(x, y);
	}
}
