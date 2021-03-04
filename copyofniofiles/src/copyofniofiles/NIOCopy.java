package copyofniofiles;

import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.io.IOException;
import java.nio.channels.*;
import java.nio.file.*;
public class NIOCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			if(args.length!=2)
			{
				System.out.println("usage:copy from to");
				return;
			}
	try
	{
		Path source=Paths.get(args[0]);
		Path target=Paths.get(args[1]);
		Files.copy(source,target,StandardCopyOption.REPLACE_EXISTING);
	
	}
	catch(IOException e)
	{
			System.out.println(" Path error"+e);
	}
			
	catch(InvalidPathException e)
	{
		System.out.println(" I/O error"+e);
	}

	
	
	
	
	
	
	
	
	
	
}

}
