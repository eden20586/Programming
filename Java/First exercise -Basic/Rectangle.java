// Name : Eden Admoni , Number Question : Question 2 , Name file : Rectangle.java
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		Scanner input_width_of_rectangle = new Scanner(System.in) ;
		System.out.print(" Please enter the width of the rectangle : " ) ;
		double width = input_width_of_rectangle.nextDouble() ;
		
		Scanner input_height_of_rectangle = new Scanner(System.in);
		System.out.print("Please enter the height of the rectangle : " ) ;		
		double height  = input_height_of_rectangle.nextDouble() ;
		
		double diagonal = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2))  ; // diagonal = sqrt(a^2 + b^2)
		
		double area = height*width ; // Area = a*b
		
		double perimeter = 2*(height+width) ; // Perimeter = 2*(a+b)
		System.out.printf("     The area of the rectangle   : %.2f\n" , area); 
		System.out.printf("The perimeter of the rectangle   :  %.2f\n" ,perimeter  );	
		System.out.printf(" The diagonal of the rectangle   :  %.2f" ,diagonal);
		
	}

}
