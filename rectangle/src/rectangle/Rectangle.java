package rectangle;

public class Rectangle {

	private double width;
	private double length;
	private double area;
	public Rectangle(double width, double length) {
		this.width = width;
		if(width<0)
			width=0;
		this.length = length;
			if(length<0)
				length=0;
			 area = width*length;
	}
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}

	public double getArea()
	{
		return area;
	}
}