package circle;

public class Circle {
	private double radius;
	protected static double area;
	public Circle(double radius)
	{
		this.radius=radius;
		if(radius<0)
			radius=0;
		area=radius*radius*22/7;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return area;
	}
}
