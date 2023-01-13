// Name : Eden Admoni , Number Question : Question 5 , Name file : Mortgage.java
import java.util.Scanner;
public class Mortgage {

	public static void main(String[] args) {
		Scanner input_annual_interest_rate_in_percent = new Scanner(System.in) ;
		System.out.print("Please enter the annual interest rate in precent : " ) ;
		double annual_interest_rate_in_precent = input_annual_interest_rate_in_percent.nextDouble() / 100 ;
		
		Scanner input_number_months_in_the_plan = new Scanner(System.in) ;
		System.out.print("Please enter the number of the months in the mortgage  : " ) ;
		int number_months_in_the_mortgage = input_number_months_in_the_plan.nextInt() ;
	
		Scanner input_monthly_payment_amount  = new Scanner(System.in) ;
		System.out.print("Please enter the monthly payment amount in the plan : " ) ;
		double monthly_deposit = input_monthly_payment_amount.nextDouble() ;
	
		double monthly_interest_rate_in_precent = annual_interest_rate_in_precent / 12;

		double mortgage_amount =  monthly_deposit * 
		((1- ( 1/ (Math.pow(1+monthly_interest_rate_in_precent, number_months_in_the_mortgage)))) / monthly_interest_rate_in_precent)  ; 
		// PV = PMT * ((1 - ((1/ ((1+R)^n)))) / R)
		System.out.printf("The mortgage amount is : %,.2f " , mortgage_amount);
	}

}
