package override;

class B extends  A 
{
	public void mult(int x,int y)
	{
		System.out.println("\n mult="+(x*y));
	}

	public void div(int x,int y)
	{
		System.out.println("\n div="+(x/y));
	}

	@Override
	public void sum(int x, int y) {
		// TODO Auto-generated method stub
		super.sum(x, y);
		//System.out.println("\n sum="+(x+y));
	}

	@Override
	public void sub(int x, int y) {
		// TODO Auto-generated method stub
		super.sub(x, y);
		//System.out.println("\n sub="+(x-y));
	}

}
