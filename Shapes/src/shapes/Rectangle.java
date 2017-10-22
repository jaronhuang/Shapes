package shapes;
/**
 * @author Jaron Huang 
 * Created 10/18/17
 * Lab 2.1 Shapes 
 */

public class Rectangle implements Shape
{
	private int length;
	private int width;
	
	/**
	 * Constructor method
	 * 
	 * @param length 
	 * @param width
	 */
	public Rectangle (int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	
	/**
	 * Returns the calculated area of a Rectangle
	 */
	public double calculateArea()
	{
		return (length*width);
	}
	
	/**
	 * Returns the calculated perimeter of a Rectangle
	 */
	public double calculatePerimeter()
	{
		return ((2*length) + (2*width));
	}
	
	/**
	 * Returns a string with the area and perimeter
	 */
	public String toString()
	{
		return "Rectangle Width: " + width + " Length: " + length + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
	}
}
