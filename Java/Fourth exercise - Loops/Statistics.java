// Name : Eden Admoni , Number Question : Question 3 , Name file : Statistics.java
import java.util.Scanner;
public class Statistics {

	public static void main(String[] args) {
		Scanner inputNumbers = new Scanner(System.in);
		System.out.print("Please enter series of numbers , -1 to finish : ");
		
		double totalNumbers = 0;
		double number = inputNumbers.nextDouble();
		int countNumbers = 0;
		int countEvenNumbers = 0;
		double minNumber = 0;
		double maxNumber = 0;
		
		if(number >= 0) //real number
		{
			totalNumbers = totalNumbers + number; // || totalNumbers += number
			countNumbers ++;
			minNumber = number;
			maxNumber = number;
			if(number%2 == 0)
			{
				countEvenNumbers++;
			}
		}
		
		while(number >= 0)
		{
			number = inputNumbers.nextDouble();
			if(number >= 0) //real number
			{
				totalNumbers = totalNumbers + number; // || totalNumbers += number
				countNumbers ++;
				
				if(number < minNumber)
				{
					minNumber = number;
				}
				
				if(number > maxNumber)
				{
					maxNumber = number;
				}
				if(number%2 == 0)
				{
					countEvenNumbers++;
				}
			
			}
		
		}
		double averageNumber = totalNumbers/countNumbers;
		System.out.printf(" The Average number is : %.2f\n " , averageNumber);
		System.out.printf("The counted even nubmer  is : %d\n " , countEvenNumbers);
		System.out.printf("The minium number is : %.2f\n " , minNumber);
		System.out.printf("The maximum number is : %.2f\n " , maxNumber);
	}

}
