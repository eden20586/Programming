// Name : Eden Admoni , Number Question : Question 3 , Name file : Savings.java
import java.util.ArrayList;
import java.util.Scanner;
public class Savings {

	public static void main(String[] args) {
		Scanner inputForSavings = new Scanner(System.in);
		System.out.println("Please enter the deposit amount : ");
		ArrayList<Double> seriesOfPmt = new ArrayList<Double>();
		double pmt = inputForSavings.nextDouble();
		seriesOfPmt.add(pmt);
		System.out.println("Please enter the interest rate (in %): ");
		double rate = inputForSavings.nextDouble() / 100 ;
		System.out.println("Please enter the number of years: ");
		int years = inputForSavings.nextInt();
		System.out.println("Year    |    Amount");
		System.out.println("-------------------");
		System.out.printf("%2d      |  %,.2f\n" , years - years , pmt);

		for(int i = 1; i <= years; i++ )
		{
			pmt = pmt * (1 + rate);
			seriesOfPmt.add(pmt);
			System.out.printf("%2d      |  %,.2f\n" , i , seriesOfPmt.get(i));
		}
	}
}
