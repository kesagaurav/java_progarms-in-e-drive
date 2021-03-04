package tostring;

public class bank {

	private String name;
	private int accno;
	public void setbank(String n, int a) {
		name = n;
		accno = a;
	}
	@Override
	public String toString() {
		return "bank [name=" + name + ", accno=" + accno + "]";
	}
	

}
