package bufferedreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bufferedreader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        FileReader fr=new FileReader("test.txt");    
        BufferedReader br=new BufferedReader(new FileReader("myfile2.java"));
		int i;
		try
		{
		while((br.read()!=-1))
		{
			fr.read();
			
		}
		}
		catch(Exception e)
		{
			System.out.println("\n error"+e);
		}
	
	br.close();
	fr.close();
	
}

}
