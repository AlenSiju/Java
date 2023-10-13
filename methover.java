/*
 * Enter the Base of the Triangle 12.5

 Enter the Height of the Triangle 13.5 

Enter the width of the Rectangle 15 

Enter the Height of the Rectangle 30 

Enter the Radius of the Circle 17.5

Area of Triangle with base: 12.5 and height: 13.5 is: 84.375 

Area of Rectangle with width: 15 and length: 30 is: 450 

Area of Circle with radius: 17.5 is: 961.625
 */
import java.util.Scanner;
public class methover{

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter height and base of triangle:");
		float height=sc.nextFloat();
		float base=sc.nextFloat();
		System.out.println("Enter radius of the circle:");
		float radius=sc.nextFloat();
		System.out.println("Enter length and breadth of the rectangle:");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		Shape shape=new Shape();
		shape.area(height,base);
		shape.area(radius);
		shape.area(length,breadth);
	}

}
class Shape{
	public void area(float height, float base) {
		System.out.println("Area of Triangle with base : "+base+" and heigth :"+height +"is : "+0.5*height*base);
	}
	public void area(float radius) {
	System.out.println("Area of circle with radius:"+ radius+" is :"+3.14*radius*radius);
	}
	public void area(int length,int breadth) {
		
		System.out.println("Area of rectangle with width :"+breadth+" and length :"+length+"is :"+length*breadth);
	}
}
