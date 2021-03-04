package inheritance;

class main {
	public static void main(String[] args) {
		
		internal1 obj=new internal1("gaurav",1,90,100);
		internal2 obj1=new internal2("deepa",2,20,40);
		System.out.println("\n ----internal1 details-----");
		obj.showstudent();
		obj.showsinternal1();
		System.out.println("\n -----internal2 details------");
		obj1.showstudent();
		obj1.showinternal2();
	}

}
