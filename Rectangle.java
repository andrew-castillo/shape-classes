package assignment3;

public class Rectangle implements Measureable{
	private double height;
	private double width; 
	
	public Rectangle(double height, double width){
		if(height < 0 || width < 0){
			throw new IllegalArgumentException("No negative direction");}
		
		this.height = height;
		this.width = width;
	}

	public void setHeight(double height){
		if(height < 0)
			throw new IllegalArgumentException("No negatives");
		this.height = height;
	}
	
	public double getHeight(){
		return height;
	}
	
	public void setWidth(double width){
		if(width < 0)
			throw new IllegalArgumentException("No negatives");
		this.width = width;
	}
	
	public double getWidth(){
		return width;
	}

	@Override
	public double getArea() {
		return getHeight() * getWidth();
	}
}