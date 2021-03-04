package datainputstream;

import java.io.DataInputStream;

public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int n;
		String str;
		DataInputStream dis=new DataInputStream(System.in);
		try
		{
			System.out.println("\n enter no");
			str=dis.readLine();
			n=Integer.parseInt(str);
			System.out.println("n="+n);
		}
		catch(Exception e)
		{
			System.out.println("\n error"+e);
		}
	
	}

}
