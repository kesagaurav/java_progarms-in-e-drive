package inheritance2;

class Marks extends Student {
	private int m1,m2;
	public void setmarks(int s1,int s2)
	{
		m1=s1;
		m2=s2;
	}
	public void showmarks()
	{
		System.out.println("\n m1="+m1+ "\t m2= "+m2);
	}
}
