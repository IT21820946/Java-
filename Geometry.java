//This is a code for the Geometry class that contains three methods for calculating the area of a circle, rectangle//
package app;
 class Geometry//The class is declared using the "class" keyword
 {
	public double getAreaOfCircle(double radius) //The first method, getAreaOfCircle()
	{
		double area= Math.PI*radius*radius;
		return area;
	}
	
	public double getAreaOfRectangle(double length,double width) //The second method, getAreaOfRectangle()
	{
		double area= length*width;
		return area;
	}
	
	double getAreaOfTriangle(double base, double height)//The third method, getAreaOfTriangle(
	{
		double area= (base * height)*1/2.0;
		return area;
	}

 }



