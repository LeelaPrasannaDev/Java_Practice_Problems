/*
 Write a Java program to create a class called Circle with a private instance variable radius. 
 Provide public getter and setter methods to access and modify the radius variable. 
 However, provide two methods called 
 calculateArea() and calculatePerimeter() 
 that return the calculated area and perimeter based on the current radius value.
 */

package encapsulation_problems;

public class Circle {
	private double radius;
	
	public double getradius()
	{
		return radius;
	}
	
	public void setradius(double d)
	{
		this.radius = d;
	}
	public double calculateArea()
	{
		double area = (3.14*radius*radius);
		return area;
	}
	public double calculatePerimeter()
	{
		double perimeter = (2*3.14*radius);
		return perimeter;
	}
}
