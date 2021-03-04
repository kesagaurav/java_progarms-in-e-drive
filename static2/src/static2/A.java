package static2;

public class A {

	private static int x;
	private int y;
		public void setvalues(int a,int b)
		{
			x=a;
			y=b;
		}
		public void showvalues()
		{
			System.out.println("static x="+x);
			System.out.println(" non static y="+y);
		}

}
