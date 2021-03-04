package file2;

import java.io.FileWriter;

public class file2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			FileWriter fout=new FileWriter("myfile1.txt");
			int ch;
			System.out.println("\n write some text here");
			while( (ch=System.in.read())!=-1)
			{
				fout.write(ch);
				
			}
		
			fout.close();
			System.out.println("\n file has created");
		}
		catch(Exception e)
		{
			System.out.println("\n error"+e);
		}
	
}

}
