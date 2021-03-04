package geometry;

import java.io.*;

public class Geo {
	
	public static void main(String[] argv) throws IOException{
		int s,l,b1,ch,square,rectangle;
		float a,b,c,area_of_triangle, pi=22/7,r;
		System.out.println("0.exit");
		System.out.println("1.areaofcircle");
		System.out.println("2.areaoftriangle");
		System.out.println("3.areaofsquare");
		System.out.println("4.areaofrectangle");
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
					System.out.println("enter radius");
					r=Float.parseFloat(br.readLine());
					c=pi*r*r;
					System.out.println("\t areaofcircle is:" +c );
						break;
			}
				else if(ch==2)
				{
					System.out.println("enter 3 nos");
					a=Float.parseFloat(br.readLine());
					b=Float.parseFloat(br.readLine());
					c=Float.parseFloat(br.readLine());
					 area_of_triangle = 1/2*a*b*c;
					System.out.println("\t area_of_triangle is:" +area_of_triangle);
						break;
				}
				else if(ch==3)
				{
					System.out.println("enter no");
					s=Integer.parseInt(br.readLine());
					square=s*s;
					System.out.println(" \t square is:" +square);
						break;
				}

				else if(ch==4)
				{
					System.out.println("enter length and breadth");
					l=Integer.parseInt(br.readLine());
					b1=Integer.parseInt(br.readLine());
					rectangle=l*b1;
					System.out.println(" \t rectangle is:" +rectangle);
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
