// Name : Eden Admoni , Number Question : Question 6 , Name file : Mortgage.java
import java.util.Scanner;
public class Mortgage {

	public static void main(String[] args) {
		final int MIN_YEARS = 5;
		final int MAX_YEARS = 30;
		final int YEAR_STEP = 5;
		final double MIN_ANNUAL_RATES = 0.03; // 3%
		final double MAX_ANNUAL_RATES = 0.09; // 9%
		final double RATES_STEP = 0.01; // 1%

		Scanner inputMortgage = new Scanner(System.in);
		System.out.println("Please enter mortgage amount : ");
		double mortgage = inputMortgage.nextDouble();
		
		System.out.printf("Monthly payment for loan of %,.2f\n" , mortgage);

		System.out.print("annual rate:");
		for(double annualRate = MIN_ANNUAL_RATES; annualRate <= MAX_ANNUAL_RATES; annualRate = annualRate + RATES_STEP)//for rates loop
		{
			System.out.printf("%9.1f%%" , annualRate*100 );
		}
		System.out.println("");

		for(int years = MIN_YEARS; years <= MAX_YEARS; years = years + YEAR_STEP)//for years loop 
		{
			System.out.printf("after %2d years" , years);
			
			for(double annualRate = MIN_ANNUAL_RATES; annualRate <= MAX_ANNUAL_RATES; annualRate = annualRate + RATES_STEP)//for rates loop
				{
					// PMT = PV * r / (1-(1+r)^-n
					// n = num of months
					// R = monthly rate
					// pmtMonthly = (mortgage * monthlyRate) / (1- (1+monthlyRate)-numberOfMonths)
					
					double monthlyRate = annualRate / 12;
					int numberOfMonths = years * 12;
					double pmtMonthly = (mortgage * monthlyRate) / (1- (Math.pow((1+monthlyRate), - numberOfMonths) ));
					System.out.printf("%,10.2f" , pmtMonthly );

				}
				System.out.println("");
	}

}
}