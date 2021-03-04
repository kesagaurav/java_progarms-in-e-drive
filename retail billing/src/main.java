import java.io.*;
public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		float price;
		String name;
		int n;
		float sum = 0;
		int[] index=new int[10];
		int quality;
		int total = 0;
		float bill=0;
		
		System.out.println("\n  item available outlet");
		System.out.println("\n ----------------------------");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("\n enter no of items");
		n=Integer.parseInt(br.readLine());
		DataInputStream dis=new DataInputStream(System.in);
		
		
		
		try
		{
			System.out.println("\n enter item index :");
			for(int i=0;i<=2;i++)
			index[i]=Integer.parseInt(br.readLine());
			System.out.println("\n enter item name");
			System.out.println("-------------------");
			name=dis.readLine();
			System.out.println("\n enter quality");
			System.out.println("-------------------");
			for(quality=0;quality<=2;quality++)
			quality=Integer.parseInt(br.readLine());
			System.out.println("\n enter price");
			System.out.println("-------------------");
			for(price=0;price<=2;price++)
			price=Float.parseFloat(br.readLine());
			sum+=price;
			System.out.println("\n the total amoount is:"+sum);
			sum*=18/100;
			System.out.println("\n final bill is:"+total);
		}
		catch(Exception e)
		{
			System.out.println("error:"+e);
		}
			System.out.println("\n thank you ! visit again");
	
	
	
	
	}

}
