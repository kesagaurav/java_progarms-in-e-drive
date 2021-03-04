package paths2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			String dirname="E://paths2";
			System.out.println("diretcory with tree starting with" + dirname +":\n");
			try {
				Files.walkFileTree(Paths.get(dirname),new myfilevisitor());
				
			}
			catch(Exception e)
			{
				System.out.println("error"+e);
			}
}

}
