package strings;

public class main {
	static String a[]= {"now","it","is","the","time","all","the","younsters","should","be","heros"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=0;j<a.length;j++)
		{
			for(int i=j+1;i<a.length;i++)
			{
				if(a[i].compareTo(a[j])<0)
			{
				String t=a[j];
				a[j]=a[i];
				a[j]=t;
			}
			}
			System.out.println(a[j]);
		}
	
	
	}
		
	}
