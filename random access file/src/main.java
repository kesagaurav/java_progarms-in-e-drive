import java.io.RandomAccessFile;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			
			RandomAccessFile rf=new RandomAccessFile("myfile1.txt","r");
			byte ch;
			rf.seek(30);
			while((ch=(byte)rf.read())!=-1)
			{
				System.out.println((char)ch);
			}
			rf.close();
		}
		catch(Exception e)
		{
			System.out.println("error"+e);
		}
	
}
}