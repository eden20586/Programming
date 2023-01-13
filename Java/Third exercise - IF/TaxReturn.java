// Name : Eden Admoni , Number Question : Question 5 , Name file : TaxReturn.java
import java.util.Scanner;
public class TaxReturn {
	static final int FIRSTLEVELTAXBRACKET = 6310 ; // הכנסה במס השכר מדרגות
	static final int SECONDLEVELTAXBRACKET = 9050 ;
	static final int THIRDLEVELTAXBRACKET = 14530 ;
	static final int LEVELFOURTAXBRACKET = 20200 ;
	static final int LEVELFIVETAXBRACKET = 42030 ;
	static final int LEVELSIXTAXBRACKET = 54130 ;	
	
	static final double FIRSTLEVELTAXPERCENTAGE = 0.10 ; // מהשכר המחושבים באחוזים המס מדרגות
	static final double SECONDLEVELTAXPERCENTAGE = 0.14 ;
	static final double THIRDLEVELTAXPERCENTAGE = 0.20 ;
	static final double LEVELFOURTAXPERCENTAGE = 0.31  ;
	static final double LEVELFIVETAXPERCENTAGE = 0.35 ;
	static final double LEVELSIXTAXPERCENTAGE = 0.47 ;
	static final double LEVELSEVENTAXPERCENTAGE = 0.50 ;
	
	public static void main(String[] args) {
		Scanner inputChooseSalaryInMonthOrYear = new Scanner(System.in);
		System.out.println("How would you like to calculate the tax? \npress '1' for Monthly or '2' for Yearly ");
		int userChoise = inputChooseSalaryInMonthOrYear.nextInt();
		Scanner inputSalary = new Scanner(System.in);
		double salary; 
		double taxMonthly;

		if(userChoise == 1)
		{	System.out.println("Please enter your monthly Salary : ");
			salary = inputSalary.nextDouble();
		}
		else
		{
			System.out.println("Please enter your yearly Salary : ");
			salary  = inputSalary.nextDouble() / 12;
		}
		if(salary <= FIRSTLEVELTAXBRACKET )
		{	
			taxMonthly = salary * FIRSTLEVELTAXPERCENTAGE;
		}
		else if(salary <= SECONDLEVELTAXBRACKET)
		{
			taxMonthly = (FIRSTLEVELTAXBRACKET * FIRSTLEVELTAXPERCENTAGE) + ((salary - FIRSTLEVELTAXBRACKET ) *SECONDLEVELTAXPERCENTAGE);
		}
		else if(salary <= THIRDLEVELTAXBRACKET)
		{
			taxMonthly = (FIRSTLEVELTAXBRACKET * FIRSTLEVELTAXPERCENTAGE) + ((SECONDLEVELTAXBRACKET - FIRSTLEVELTAXBRACKET) * SECONDLEVELTAXPERCENTAGE ) 
			+ ((salary - SECONDLEVELTAXBRACKET ) *THIRDLEVELTAXPERCENTAGE);
		}
		else if(salary <= LEVELFOURTAXBRACKET)
		{
			taxMonthly = (FIRSTLEVELTAXBRACKET * FIRSTLEVELTAXPERCENTAGE) + ((SECONDLEVELTAXBRACKET - FIRSTLEVELTAXBRACKET) * SECONDLEVELTAXPERCENTAGE )
			+ ((THIRDLEVELTAXBRACKET - SECONDLEVELTAXBRACKET) * THIRDLEVELTAXPERCENTAGE) + ((salary - THIRDLEVELTAXBRACKET ) *LEVELFOURTAXPERCENTAGE);
		}
		else if(salary <= LEVELFIVETAXBRACKET)
		{
			taxMonthly = (FIRSTLEVELTAXBRACKET * FIRSTLEVELTAXPERCENTAGE) + ((SECONDLEVELTAXBRACKET - FIRSTLEVELTAXBRACKET) * SECONDLEVELTAXPERCENTAGE )
			+ ((THIRDLEVELTAXBRACKET - SECONDLEVELTAXBRACKET) * THIRDLEVELTAXPERCENTAGE) + ((LEVELFOURTAXBRACKET - THIRDLEVELTAXBRACKET)  * LEVELFOURTAXPERCENTAGE)
			+ ((salary - LEVELFOURTAXBRACKET ) *LEVELFIVETAXPERCENTAGE);
		}
		else if(salary <= LEVELSIXTAXBRACKET)
		{
			taxMonthly = (FIRSTLEVELTAXBRACKET * FIRSTLEVELTAXPERCENTAGE) + ((SECONDLEVELTAXBRACKET - FIRSTLEVELTAXBRACKET) * SECONDLEVELTAXPERCENTAGE )
			+ ((THIRDLEVELTAXBRACKET - SECONDLEVELTAXBRACKET) * THIRDLEVELTAXPERCENTAGE) + ((LEVELFOURTAXBRACKET - THIRDLEVELTAXBRACKET)  * LEVELFOURTAXPERCENTAGE)
			+ ((LEVELFIVETAXBRACKET - LEVELFOURTAXBRACKET)  * LEVELFIVETAXPERCENTAGE) + ((salary - LEVELFIVETAXBRACKET ) *LEVELSIXTAXPERCENTAGE);
		}
		else
		{
			taxMonthly = (FIRSTLEVELTAXBRACKET * FIRSTLEVELTAXPERCENTAGE) + ((SECONDLEVELTAXBRACKET - FIRSTLEVELTAXBRACKET) * SECONDLEVELTAXPERCENTAGE )
			+ ((THIRDLEVELTAXBRACKET - SECONDLEVELTAXBRACKET)  * THIRDLEVELTAXPERCENTAGE) + ((LEVELFOURTAXBRACKET - THIRDLEVELTAXBRACKET) * LEVELFOURTAXPERCENTAGE)
			+ ((LEVELFIVETAXBRACKET - LEVELFOURTAXBRACKET)  * LEVELFIVETAXPERCENTAGE) + ((LEVELSIXTAXBRACKET - LEVELFIVETAXBRACKET) * LEVELSIXTAXPERCENTAGE)
			+ ((salary - LEVELSIXTAXBRACKET ) *LEVELSEVENTAXPERCENTAGE);
		}
		if (userChoise == 1)
		{
			System.out.printf("Your monthly tax is : %,.0f NIS ", taxMonthly );
		}
		else
		{
			double taxYearly = taxMonthly * 12;
			System.out.printf("Your yearly tax is : %,.0f NIS ", taxYearly );
		}
}
}
