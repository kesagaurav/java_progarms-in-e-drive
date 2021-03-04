
 class result extends marks {
	 public result(String s, int r) {
		super(s, r);
		// TODO Auto-generated constructor stub
	}

	private int tot;
	 private double avg;
	 public void calculate()
	 {
		 tot=m1+m2;
		 avg=tot/2.0;
	 }

	 public void showmarks()
	 {
		 System.out.println("\n tot="+tot+"\t avg="+avg);
	 }
 }
