package add;


import java.io.*;

public class Add {

	public static void main(String argv[]) throws IOException
	{
		int a,b,c;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		try
		{
		System.out.println("enter 2 nos");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		c=a+b;
		System.out.println(c);
		
	}
		catch(Exception e)
		{
			System.out.println("error"+e);
		}
}
}
 