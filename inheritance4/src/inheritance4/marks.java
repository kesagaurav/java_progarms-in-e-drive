package inheritance4;

 class marks extends student {
	 private int m1,m2;
	 public marks(String s, int r, int i,int s1,int s2) {
		super(s, r, i);
		m1=s1;
		m2=s2;
	}
	 public void showmarks()
	 {
		 System.out.println("\n m1="+m1 +"\t m2="+m2);
	 }

}
