package inheritance;

public class Dog extends Animal
{
	private int eye;
	private int legs;
	private int teeth;
	public Dog(String name, int size, int weight, int body,int eye,int legs,int teeth) {
		super(name,size,weight,body);
		// TODO Auto-generated constructor stub
		this.eye=eye;
		this.legs=legs;
		this.teeth=teeth;
	}
	public void chew()
	{
		System.out.println("dog.chew() is called");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("dog.eat() is called");
		chew();
		super.eat();
	}
	
	public void walk() {

		System.out.println("dog.wall() is called");
		move(5);
	}

	public void run() {
		System.out.println("dog.run() is called");
		move(10);
	}

}