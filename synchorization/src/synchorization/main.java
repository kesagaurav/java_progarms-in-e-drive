package synchorization;

public class main {

	public static void main(String[] args) {
		
		shop obj=new shop();
		producer p=new producer(obj);
		consumer s=new consumer(obj);

	}

}
