package server;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.*;
public class Server {

public static void main(String[] args) throws IOException
{
	ServerSocket  ss = new ServerSocket(8080);
	Socket s=ss.accept();
	OutputStream os=s.getOutputStream();
	PrintStream ps=new PrintStream(os);
	ps.print("hello");
	ps.print("welcome");
	ps.print("to");
	ps.print("the");
	ps.print("world");
	ps.print("of networking");
	ps.close();
	ss.close();
	s.close();
	os.close();
	
	
}

}
