package assignment3;

public class Box extends Rectangle{
	private double depth;

	public Box(double height, double width, double depth) {
		super(height, width);
		if(depth < 0)
			throw new IllegalArgumentException("No negative depth");
		this.depth = depth;
	}
	
	public void setDepth(double depth){
		if(depth < 0)
			throw new IllegalArgumentException("No negative depth");
		this.depth = depth;
	}
	
	public double getDepth(){
		return depth;
	}
	
	@Override
	public double getArea(){
		return (2*((getDepth()*getHeight()) + (getWidth()*getDepth()) + (getHeight()*getWidth())));
	}	
}