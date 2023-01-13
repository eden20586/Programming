// Name : Eden Admoni , Number Question : Question 5 , Name file : Diamond.java
import java.util.Scanner;
public class Diamond {

	public static void main(String[] args) {
		Scanner inputNumber = new Scanner(System.in);
		System.out.print("Please enter number for diamond's shape : ");
		int number = inputNumber.nextInt();
		int space = 1;
		
		for(int i = 1; i <= number; i++)
		{
			for(int z = 1; z<= number - i; z++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= ((i*2)-1); j++)
			{
				System.out.print("*");
			}
			System.out.println("");		
		}
		for(int i = 1; i <= number -1 ; i++)
		{
			for(int z = 1; z<= space; z++)
			{
				System.out.print(" ");
			}
			space++;
			for(int j = 1; j <= (2 * (number - i)) - 1; j++)
			{
				System.out.print("*");
			}
			System.out.println("");	
		}
	
	}
}

