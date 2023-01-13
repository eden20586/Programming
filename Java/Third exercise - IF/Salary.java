// Name : Eden Admoni , Number Question : Question 3 , Name file : Salary.java
import java.util.Scanner;
public class Salary {
	static final double BASIC_HOURS_WITH_REGULAR_WAGE_WITHOUT_EXTRA = 40.00;
	static final double EXTRA_PRECENTAGE_ON_OVERTIME = 1.5;
	public static void main(String[] args) {
		Scanner input_employee_name = new Scanner(System.in);
		System.out.print("Please enter your name : ");
		String employee_name = input_employee_name.next();
	
		Scanner input_hourly_wage = new Scanner(System.in);
		System.out.print("Please enter your hourly wage : ");
		double hourly_wage = input_hourly_wage.nextDouble();
		
		Scanner input_numbers_hours_working_monthly = new Scanner(System.in);
		System.out.print("Please enter your numbers hours in your working monthly : ");
		double numbers_hours_in_month = input_numbers_hours_working_monthly.nextDouble();
		
		double monthly_salary = 0;
		double hours_for_150_precent  = numbers_hours_in_month - BASIC_HOURS_WITH_REGULAR_WAGE_WITHOUT_EXTRA;
		
		if(numbers_hours_in_month > BASIC_HOURS_WITH_REGULAR_WAGE_WITHOUT_EXTRA)
		{
			monthly_salary = monthly_salary + (BASIC_HOURS_WITH_REGULAR_WAGE_WITHOUT_EXTRA * hourly_wage) + 
			(hours_for_150_precent *(hourly_wage * EXTRA_PRECENTAGE_ON_OVERTIME));
			System.out.printf("%s's monthly salary is : %,.2f NIS " ,employee_name , monthly_salary );	
		}
		else
		{
			monthly_salary = monthly_salary + (numbers_hours_in_month * hourly_wage);
			System.out.printf("%s's montlhy salary is : %,.2f NIS " ,employee_name , monthly_salary );
		}
	}
}
