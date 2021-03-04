
public class computer implements Runnable {
	printer obj;
	String name;
	Thread t;
	public computer(printer p,String name1) {
		
		obj=p;
		name=name1;
		t=new Thread(this,"name");
		t.start();
	}
	@Override
	public void run() {
		obj.print(name);
		
	}
	

}
