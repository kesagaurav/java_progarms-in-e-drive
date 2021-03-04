package channelread;

import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.io.*;
import java.nio.channels.*;

public class channelread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int count;
			//here,the channel is opened without using the filepath variable and path is 
			//returned by Paths.get() method
			
			try(SeekableByteChannel fchan=Files.newByteChannel(Paths.get("myfile.txt")))
					{
						//Allocate the buffer
						ByteBuffer mbuf=ByteBuffer.allocate(150);
					
					do
					{
						//read a buffer
						count=fchan.read(mbuf);
						//stops the buffer when the file is at the end
						if(count!=-1)
						{
							//rewind the buffer so that it can be read
							mbuf.rewind();
							//read the  bytes from buffer and show them on the screen as 
							//characters 
							for(int i=0;i<count;i++)
								System.out.println((char)mbuf.get());
						}
					}while(count!=-1);
					System.out.println();
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
