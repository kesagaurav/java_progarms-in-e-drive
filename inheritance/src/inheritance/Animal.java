package inheritance;

public class Animal {

	private String name;
	private int size;
	private int weight;
	private int body;
	public Animal(String name, int size, int weight, int body) 
	{
		this.name = name;
		this.size = size;
		this.weight = weight;
		this.body = body;
	}
	public void eat()
	{
		System.out.println("\n Animal.eat() is called");
	}	
		
	public void move(int speed)
	{
		System.out.println("\n animal is moving at " +speed);
	}
		public String getName() 
		{
		return name;
		}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getBody() {
		return body;
	}
	public void setBody(int body) {
		this.body = body;
	}
}
