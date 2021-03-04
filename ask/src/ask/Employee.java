package ask;

public class Employee {
	private String name;
	private int id;
	private String street;
	private int address;
	private String martial_status;
	public Employee() 
	{
		name ="gaurav";
		id=101;
		street ="warangal";
		address=16__3__318;
		martial_status ="unmarried";
	}

	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e.name);
		System.out.println(e.id);
		System.out.println(e.street);
		System.out.println(e.address);
		System.out.println(e.martial_status);
	}
	}


