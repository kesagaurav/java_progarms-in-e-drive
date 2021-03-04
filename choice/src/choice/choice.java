package choice;
import java.io.*;
import java.lang.*;

public class choice {
	public static void main(String arv[]) throws IOException{
		int a,b,c;
		char ch;
		System.out.println("\n 0.exit");
		System.out.println("\n 1.add");
		System.out.println("\n 2.sub");
		System.out.println("\n 3.mul");
		System.out.println("\n 4.div");
		System.out.println("\n enter your choice");
		ch=(char) System.in.read();
		while(ch!=0)
		{
		if(ch==1)
		{
		System.out.println("\n enter 2 nos");
		a=(int) System.in.read();
		b=(int) System.in.read();
		c=a+b;
		System.out.println("\n c=%d:"+c);
		}
		else if(ch==2)
		{
		System.out.println("\n enter 2 nos");
		a=(int) System.in.read();
		b=(int) System.in.read();
		c=a-b;
		System.out.println("\n c=%d:"+c);
		}
		else if(ch==3)
		{
		System.out.println("\n enter 2 nos");
		a=(int) System.in.read();
		b=(int) System.in.read();
		c=a*b;
		System.out.println("\n c=%d:"+c);
		}
		else if(ch==4)
		{
		System.out.println("\n enter 2 nos");
		a=(int) System.in.read();
		b=(int) System.in.read();
		c=a/b;
		System.out.println("\n c=%d:"+c);
		}
		//ch=(char) System.in.read();
		//break;
		}
		}
		}


