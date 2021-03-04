package paths;

import java.io.BufferedReader;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.*;

public class mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path=FileSystems.getDefault().getPath("gaurav.txt");
		printfile(path);
}

	private static void printfile(Path path) {
		// TODO Auto-generated method stub
		try(BufferedReader fileReader=Files.newBufferedReader(path)){
			String line;
			while((line=fileReader.readLine())!=null) 
			{
				System.out.println(line);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}	
	}
}
