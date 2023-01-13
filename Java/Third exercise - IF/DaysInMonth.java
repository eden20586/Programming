// Name : Eden Admoni , Number Question : Question 4 , Name file : DaysInMonth.java
import java.util.Scanner;
public class DaysInMonth {

	public static void main(String[] args) {
		Scanner inputMonthName = new Scanner(System.in);
		System.out.print("Please enter a month : ");
		String monthName = inputMonthName.next();
		
		int numberDays;
		int	numberDays2;
		
		if(monthName.equals("January") || monthName.equals("March") || monthName.equals("May") || monthName.equals("July") || monthName.equals("August") ||monthName.equals("October") || monthName.equals("December"))
		{
			numberDays = 31;
			System.out.printf("The month %s is contain %d days . " , monthName , numberDays);
		}
		else if(monthName.equals("April") || monthName.equals("June")|| monthName.equals("September") || monthName.equals("November"))
		{	
			numberDays = 30;
			System.out.printf("The month %s is contain %d days . " , monthName , numberDays);
		}	
		else
		{
			numberDays = 28;
			numberDays2 = 29;
			System.out.printf("The month %s is contain %d or %d days . " , monthName , numberDays , numberDays2);	
		}	
	}
}
