//This code is a Java program that provides a menu of options for calculating the area of a circle, rectangle, or triangle. The user can choose one of these options or exit the program.
package app;
import java.util.Scanner;
public class Demo{
	public static void main(String[] args) {
		
		System.out.println("Geometry Calculator");
		System.out.println("1.Calculate the Area of a Circle");
		System.out.println("2.Calculate the area of a Rectangle");
		System.out.println("3.Calculate the area of a Triangle");
		System.out.println("4.Exit");
		
		//create object scanner
			
			Scanner scan = new Scanner(System.in);//Scanner object named scan to read input from the user.
			Geometry g1= new Geometry();//Geometry class named g1 to perform the area calculations.
			char choice;
			/* do-while loop that allows the user to enter their choice of operation and perform the corresponding calculation.
			If the user enters an invalid input, the program will print out an error message.*/
			do {
				System.out.println("Enter your choice(1-4) :");
				int x=scan.nextInt();
				
				
				if(x==1) {
					//method to calculate are of circle when the user input radius
					System.out.println("Please enter the radius : ");
					double r=scan.nextDouble();
					
					double areaCircle=g1.getAreaOfCircle(r);
					System.out.println("The area of the circle is " +areaCircle);
					}
				else if(x==2) {
					//method to calculate are of rectangle when the user input length and width
					System.out.println("Please enter the length : ");
					double l=scan.nextDouble();
					System.out.println("Please enter the width : ");
					double w=scan.nextDouble();
					
					
					double areaRectangle=g1.getAreaOfRectangle(l,w);
					System.out.println("The area of the rectangle is " +areaRectangle);
				}
				else if(x==3) {
					//method to calculate are of triangle when the user input base and height
					System.out.println("Please enter the base : ");
					double b=scan.nextDouble();
					System.out.println("Please enter the height : ");
					double h=scan.nextDouble();
					
					double areatriangle=g1.getAreaOfRectangle(b,h);
					System.out.println("The area of the triangle is " + areatriangle);
				}
				else if(x==4){
					//if user input 4 quit massage will be shown
					System.out.println("Quit");
				}
				else {
					System.out.println("Invalid input");
				}
				
			
				System.out.println("Do you need to continue(Y/N)");
				choice=scan.next().charAt(0);
			
		}
			while(choice=='Y'||choice=='y');
			System.out.println();
			System.out.println("Thank you!!!");
			scan.close();
}
}