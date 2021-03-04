package wall;

public class Wall1 {
	private double height;
	private double width;
	public void getArea()
	{
	}
		public void getArea(double height,double width) {
			this.width=width;
			this.height=height;
		if(width<0)
		{
			System.out.println("width=0");
		}
		else if(height<0)
		{
			System.out.println("height=0");
		}
	}
		public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
}	

