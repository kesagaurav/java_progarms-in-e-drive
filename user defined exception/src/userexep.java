
public class userexep {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

			bank obj=new bank();
			obj.createaccount("gaurav", 105, 500000.00);
			System.out.println("\n obj details---------");
			obj.showaccount();
			bank obj1=new bank();
			obj1.createaccount("raju",900,100.00);
			System.out.println("\n obj1 details---------");
			obj1.showaccount();
			bank obj2=new bank();
			obj2.createaccount("kumar",200,1000.00);
			System.out.println("\n obj2 details---------");
			obj2.showaccount();
			bank obj3=new bank();
			obj3.createaccount("ashish",100,5000.00);
			System.out.println("\n obj3 details---------");
			obj3.showaccount();
			bank obj4=new bank();
			obj4.createaccount("samjay",800,100000.00);
			System.out.println("\n obj4 details---------");
			obj4.showaccount();
		
}
}