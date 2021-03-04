package rectangle;

 class Cuboid extends Rectangle {

	private double height;
	private double volume;


	public Cuboid(double width, double length,double height) {
		super(width,length);
		this.height=height;
			if(height<0)
				height=0;
			 //double area = 0;
			volume = width*length*height;
	
	}


	public double getHeight() {
		return height;
	}


	public double getVolume() {
		return volume;
	}

}
