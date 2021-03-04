package sub;
//import java.lang.*;
import java.io.*;
public class Sub {

	public static void main(String[] args) throws IOException {
		int a,b,c;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		try
		{
			System.out.println("enter 2 nos");
			a=Integer.parseInt(br.readLine());
			b=Integer.parseInt(br.readLine());
			c=a-b;
			System.out.println("\n Sub of two numbers:" + c);
		}
		catch(Exception e)
		{
			System.out.println("error" +e);
		}

	}

}
