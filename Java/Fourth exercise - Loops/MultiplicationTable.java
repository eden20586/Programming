// Name : Eden Admoni , Number Question : Question 4 , Name file : MultiplicationTable.java
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		final int MIN_RANGE_FIRST_LOOP = 1;
		final int MIN_RANGE_SECOND_LOOP = 2;

		Scanner inputNumber = new Scanner(System.in); 
		System.out.print("Please enter a number for MultiplicationTable : ");
		int x = inputNumber.nextInt();
		int z = 0;
		for(int i = MIN_RANGE_FIRST_LOOP ; i <= x ; i++)//for lines loop 
		{
			System.out.printf("%2d" , i);
			
			for(int j = MIN_RANGE_SECOND_LOOP; j <= x; j++ )//for columns loop
				{
					z = j * i;
					System.out.printf("%4d" , z);
				}
				System.out.println("");

		}
	}
}