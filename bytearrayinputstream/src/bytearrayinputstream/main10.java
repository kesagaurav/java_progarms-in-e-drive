package bytearrayinputstream;

import java.io.*;
public class main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="programming languages institution in warangal";
		byte b[]=str.getBytes();
		ByteArrayInputStream obj=new ByteArrayInputStream(b);
		byte ch;
		while((ch=(byte)obj.read())!=-1)
{
	System.out.println( (char)ch);
}
	
	
	}

}
