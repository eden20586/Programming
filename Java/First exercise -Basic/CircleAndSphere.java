// Name : Eden Admoni , Number Question : Question 3 , Name file : CircleAndSphere.java
import java.util.Scanner;
public class CircleAndSphere {

	public static void main(String[] args) {
		Scanner input_radius = new Scanner(System.in); 
		
		System.out.print("Please enter the radius : " ) ;
		double radius = input_radius.nextDouble() ;
		
		double area = Math.PI * Math.pow(radius , 2) ; // Area of circle = 3.14*radius^2
		double circumference = 2 * Math.PI *radius; // circumference of circle  = 2*3.14*radius
		double volume = 1.333333333 * Math.PI *Math.pow(radius , 3); // volume of sphere = 1.333333333*3.14*radius^3
		double Surface_area = 4 * Math.PI * Math.pow(radius , 2); // Surface area of sphere = 4*3.14*r^2
		
		System.out.printf("         The area of the circle is:  %,.2f\n" , area);
		System.out.printf("The circumference of the circle is:  %,.2f\n" , circumference);
		System.out.printf("       The volume of the sphere is:  %,.2f\n" , volume);
		System.out.printf(" The Surface area of the sphere is:  %,.2f\n" , Surface_area);
	}

}
