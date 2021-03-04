package tostring;

public class toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bank obj=new bank();
		obj.setbank("gaurav",101);
		System.out.println("\n bank:"+obj);
		String str="bank details:"+obj;
		System.out.println("\n str:"+str);
		String str1=obj.toString();
		System.out.println("\n str1:"+str1);
		
		
	}

}
