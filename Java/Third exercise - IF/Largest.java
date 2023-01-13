// Name : Eden Admoni , Number Question : Question 1 , Name file : Largest.java
import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		Scanner input_numbers = new Scanner(System.in);
		System.out.print("Please enter three numbers : ");
		double first_num = input_numbers.nextDouble();
		double second_num = input_numbers.nextDouble();
		double third_num = input_numbers.nextDouble();

		double max_num;
		
		if (first_num >= second_num && first_num >= third_num)
		{
			max_num = first_num ;
		}
		else if(second_num >= first_num && second_num >= third_num)
		{
			max_num = second_num ;
		}
		else 
		{
			max_num = third_num ;
		}
		System.out.printf("The largest number is : %.2f . ", max_num);
		}
}
