// Name : Eden Admoni , Number Question : Question 4 , Name file : SavingsPlan.java
import java.util.Scanner;
public class SavingsPlan {

	public static void main(String[] args) {
		Scanner input_annual_interest_rate_in_percent = new Scanner(System.in) ;
		System.out.print("Please enter the annual interest rate in precent : " ) ;
		double annual_interest_rate_in_precent = input_annual_interest_rate_in_percent.nextDouble() / 100 ;
		
		Scanner input_number_months_in_the_plan = new Scanner(System.in) ;
		System.out.print("Please enter the number of the months in the plan : " ) ;
		int number_months_in_the_plan = input_number_months_in_the_plan.nextInt() ;
	
		Scanner input_monthly_payment_amount  = new Scanner(System.in) ;
		System.out.print("Please enter the monthly payment amount in the plan : " ) ;
		double monthly_deposit = input_monthly_payment_amount.nextDouble() ;
	
		double monthly_interest_rate_in_precent = annual_interest_rate_in_precent / 12;
		
		double the_future_value = monthly_deposit * (Math.pow(1+monthly_interest_rate_in_precent , number_months_in_the_plan ) -1 )/monthly_interest_rate_in_precent;
		// FV = PMT * ((1+r)^n )- 1)/r
		System.out.printf("The future value of the plan is : %,.2f " , the_future_value  ) ;
	}

}
