package paths2;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class myfilevisitor extends SimpleFileVisitor<Path>{
	public FileVisitResult visitFile(Path path,BasicFileAttributes attribs)
	//throws IOException;
	{
		System.out.println(path);
		return  FileVisitResult.CONTINUE;
	}

}
