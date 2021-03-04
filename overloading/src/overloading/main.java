package overloading;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank obj=new bank();
		bank obj1=new bank("B");
		bank obj2=new bank("C",103);
		System.out.println("\n obj details----------------");
		obj.showbank();
		System.out.println("\n obj1 details------------");
		obj1.showbank();
		System.out.println("\n obj2 details---------------");
		obj2.showbank();
	}

}
