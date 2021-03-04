
import java.io.*;
public class bank 
		{
		private String name;
		private int accno;
		public bank() throws IOException 
		{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			try
			{
				System.out.println("\n enter name and accno");
				name=br.readLine();
				accno=Integer.parseInt(br.readLine());
			}
			catch (Exception e)
			{
				System.out.println("\n error"+e);
			}
		}
		public void showbank()
		{
			System.out.println("\n name="+name+"\t accno="+accno);
		}

}
