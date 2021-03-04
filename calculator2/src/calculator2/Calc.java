package calculator2;

import java.io.*;

public class Calc {
	
	public static void main(String[] argv) throws IOException{
		int a=0,b=0,c,ch;
		System.out.println("0.exit");
		System.out.println("1.add");
		System.out.println("2.sub");
		System.out.println("3.mul");
		System.out.println("4.div");
		System.out.println("\n enter your choice");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		ch=Integer.parseInt(br.readLine());
		try
		{
			while(ch!=0)
			{
				
				if(ch==1)
			{
			   
				System.out.println("enter 2 nos");
				a=Integer.parseInt(br.readLine());
				b=Integer.parseInt(br.readLine());
				c=a+b;
			    System.out.println("\n Sum of two numbers:" + c);
			   		break;
			   
			}
			else if(ch==2)
			{
				 System.out.println("enter 2 nos");
				 a=Integer.parseInt(br.readLine());
				 b=Integer.parseInt(br.readLine());
				   c=a-b;
				  System.out.println("\n Sub of two numbers:" + c);
				   break;
				   
				   
			}
			else if(ch==3)
			{
				 System.out.println("enter 2 nos");
				 a=Integer.parseInt(br.readLine());
				 b=Integer.parseInt(br.readLine());
				   c=a*b;
				 System.out.println("\n mul of two numbers:" + c);
				   break;
				   
				   
			}
			else if(ch==4)
			{
				 System.out.println("enter 2 nos");
				 a=Integer.parseInt(br.readLine());
				 b=Integer.parseInt(br.readLine());
				   c=a/b;
				 System.out.println("\n div of two numbers:" + c);
				   break;
				   
				   
			}
			else
			{
				System.out.println("invalid choice");
				break;
			}	
			}
			
		}
		catch(Exception e)
		{
			System.out.println("error" +e);
		}
		}
}