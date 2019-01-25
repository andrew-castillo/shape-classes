package assignment3;

public class Circle implements Measureable{
	private double radius;
	
	public Circle(double radius){
		if(radius < 0){
			throw new IllegalArgumentException("No negative direction");}
		
		this.radius = radius;
	}

	public void setRadius(double radius){
		if(radius < 0)
			throw new IllegalArgumentException("No negatives");
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}

	@Override
	public double getArea() {
		return Math.pow(getRadius(), 2)*3.14159;
	}
}