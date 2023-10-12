package encapsulation_problems;

public class CircleDemo {

	public static void main(String[] args) {
		
		// create a object
		
		Circle c = new Circle();
		
		//set values using setter methods
		c.setradius(5.4);
		// get values using getter method
		
		double radius = c.getradius();
		double area = c.calculateArea();
		double perimeter = c.calculatePerimeter();
		//print values
		System.out.println("Radius of cricle = "+radius);
		System.out.println("Area of cricle = "+area);
		System.out.println("Perimeter of cricle = "+perimeter);
		
	}

}
