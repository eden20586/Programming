// First name : Eden , Last Name : Admoni , Number Question : Question 1 , Name file : SavingsPlan.java
import java.util.Scanner;
import java.util.ArrayList;
public class SavingsPlan {

	public static void main(String[] args) {
		ArrayList<Double> fvList = new ArrayList<Double>();
		Scanner inputSavingsPlan = new Scanner(System.in);
		System.out.print("Please enter monthly deposit amount : ");
		double monthlyDeposit = inputSavingsPlan.nextDouble();
		System.out.print("Please enter annual rate (%) : ");
		double rate = (inputSavingsPlan.nextDouble() / 100) / 12;
		System.out.print("Please enter the number of years : ");
		int years = inputSavingsPlan.nextInt() * 12;
		
		double fv = (monthlyDeposit * ((Math.pow(1 + rate, years)) - 1)) / rate;
		double totalPayments = monthlyDeposit * years;
		System.out.printf("The future value after %d years : %,.2f\n" , years / 12 , fv);
		System.out.printf("The total amount of payments    : %,.2f\n" , totalPayments);
		System.out.printf("The total interest earned       : %,.2f\n" , fv - totalPayments);

		System.out.println("Future value by years : "); 
		System.out.println("------------------------------------"); 
		System.out.println("year   | future value");
		System.out.println("------------------------------------"); 
		fvList.add(0.00);

		for(int i = 1 ; i <= years; i++)
		{
			fv = monthlyDeposit * ((Math.pow(1 + rate, i - 1)) - 1) / rate;
			fv = (fv * (1 + rate)) + monthlyDeposit;
			fvList.add(fv);
		}
		
		for(int i = 12; i < fvList.size(); i+=12)
		{
			System.out.printf("%2d     |%,10.2f\n" , i / 12 , fvList.get(i));
		}		
	}

}
