// Name : Eden Admoni , Number Question : Question 1 , Name file : LargestInArray.java
import java.util.ArrayList;
import java.util.Scanner;
public class LargestInArray {

	public static void main(String[] args) {
		Scanner inputNumber = new Scanner(System.in);
		System.out.print("Please enter series of integer numbers , Q to quit : ");
		ArrayList<Integer> seriesOfNumbers = new ArrayList<Integer>();
		if(inputNumber.hasNextInt() == true) 
		{			
			while(inputNumber.hasNextInt())
			{
				int newNumber = inputNumber.nextInt();
				seriesOfNumbers.add(newNumber);
			}
			seriesOfNumbers.sort(null);			
			for(int i = 0; i < seriesOfNumbers.size(); i++ )
			{				
				if(seriesOfNumbers.get(i) == seriesOfNumbers.get(seriesOfNumbers.size() -1))
				{
					System.out.printf("%d <=== largest value\n" , seriesOfNumbers.get(seriesOfNumbers.size() -1));
				}
				else
				{
					System.out.printf("%d\n" , seriesOfNumbers.get(i));
				}
			}
		}
		else
		{
			System.out.println("The list of values is empty"); 
		}
		
		}
}