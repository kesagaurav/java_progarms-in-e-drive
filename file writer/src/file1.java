import java.io.FileWriter;

public class file1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			FileWriter fout=new FileWriter("myfile.txt");
			int ch;
			System.out.println("\n plz write some text");
			while((ch=System.in.read())!=-1)
			{
				fout.write(ch);
				
			}
			
			fout.close();
			System.out.println("\n file created");
		}
		catch(Exception e)
		{
			System.out.println("\n error"+e);
		}
	}

}
