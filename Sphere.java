package assignment3;

public class Sphere extends Circle{

	public Sphere(double radius) {
		super(radius);
		if(radius < 0)
			throw new IllegalArgumentException("No negative depth");
	}
	
	public void setRadius(double radius){
		if(radius < 0)
			throw new IllegalArgumentException("No negative depth");
	}

	@Override
	public double getArea(){
		return (4*3.14159*Math.pow(getRadius(), 2));
	}
}