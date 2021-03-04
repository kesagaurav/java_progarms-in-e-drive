package abstract1;

public class class2 extends rectangle{

	@Override
	public void square(int x) {
		// TODO Auto-generated method stub
		System.out.println("\n square="+(x*x));
	}

	@Override
	public void circle(float r) {
		// TODO Auto-generated method stub
		System.out.println("\n circle="+(4*4*3.14));
	}

	public void perimeterofsquare(int s)
	{
		System.out.println("\n perimeteterofsquare="+(4*s));
	}

}
