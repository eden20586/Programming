// Name : Eden Admoni , Number Question : Question 2 , Name file : Median.java
import java.util.ArrayList;
import java.util.Scanner;

public class Median {
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
			System.out.printf("Max number    = %d\n" , seriesOfNumbers.get(seriesOfNumbers.size() -1));
			System.out.printf("Min number    = %d\n" , seriesOfNumbers.get(0));
			int medianOrgan = (seriesOfNumbers.size() / 2);
			System.out.printf("Median number = %d\n" , seriesOfNumbers.get(medianOrgan));

			System.out.println("Sorted list with median :");
			for(int i = 0; i < seriesOfNumbers.size(); i++ )
			{				
				if(seriesOfNumbers.get(i) == seriesOfNumbers.get(medianOrgan) )	
				{
				System.out.printf("%d <=== median\n" , seriesOfNumbers.get(i));	
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


