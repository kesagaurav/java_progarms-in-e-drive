package inheritance;

 class internal2 extends student {
	 private int m1,m2;
	public internal2(String s, int r,int s1,int s2) {
		super(s, r);
		m1=s1;
		m2=s2;
		
	}
		public void showinternal2()
		{
			System.out.println("\n m1="+m1+"\t m2="+m2);
		}
}
