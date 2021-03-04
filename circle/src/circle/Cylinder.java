package circle;

 class Cylinder extends Circle {

	  
     private double height;
     private double volume;
	 
	 public Cylinder(double radius,double height) {
		super(radius);
		this.height=height;
        if(height<0)
         height=0;
        volume=radius*height;
	
	}

	public double getHeight() {
		return height;
	}

	public double getVolume() {
		return volume;
	}
	 
}
