package assignment3;
import java.util.Random;
import java.util.ArrayList;

public class Main {
	
	private static double nextDouble(){
		Random random = new Random();
		double x = random.nextDouble();
		double y = 0;
		if(x > 0 && x <= 1)
			y = x;
		return y; 
	}
	
	
	private static double calculateSum(ArrayList<Measureable> arr){
		double sum = 0;
		for(int i = 0; i < arr.size(); i++){
			sum += arr.get(i).getArea();
		}
		return sum;
	}


	public static void main(String[] args) {
		ArrayList<Measureable> arr_list = new ArrayList<Measureable>();
		int circle_count = 0;
		int rectangle_count = 0;
		int sphere_count = 0;
		int box_count = 0;
		
		for (int i = 0; i < 1000; i++){
			double random = Math.random();
			if(random < (.25)){
				arr_list.add(new Circle(nextDouble()));
				circle_count +=1;
			}
			
			else if (random<(.5)&&random>(.25)){
				arr_list.add(new Rectangle(nextDouble(), nextDouble()));
				rectangle_count += 1;
			}
			
			else if(random < (.75)&&random>(.5)){
				arr_list.add(new Sphere(nextDouble()));
				sphere_count += 1;
				
			}
			
			else if(random < (1)&&random>(.75)){
				arr_list.add(new Box(nextDouble(), nextDouble(), nextDouble()));
				box_count += 1;
			}
			
			
		}
		
		System.out.print("Rectangles: ");
		System.out.print(rectangle_count);
		
		System.out.print(" Boxes: ");
		System.out.print(box_count);
		
		System.out.print(" Circles: ");
		System.out.print(circle_count);
		
		System.out.print(" Spheres: ");
		System.out.print(sphere_count);
		
		System.out.print("\nSum: ");
		System.out.print(calculateSum(arr_list));
	}
}