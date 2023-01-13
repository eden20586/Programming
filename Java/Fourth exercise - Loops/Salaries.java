// Name : Eden Admoni , Number Question : Question 2 , Name file : Salaries.java
import java.util.Scanner;
public class Salaries {

	public static void main(String[] args) {
   	   	  Scanner inputSalaries = new Scanner(System.in);
   	      System.out.print("Please enter salary , -1 to finish : ");	
   	   	  double salary = inputSalaries.nextDouble();
		  double totalSalaries = 0;
		  int countNumSalaries = 0;
	   	   	
	   	  if(salary >= 0) 
	        {  
	        	 totalSalaries = totalSalaries + salary;
	        	 countNumSalaries++;
	        }
		  
	      while (salary >= 0)
	      {     	   	   
	    	salary = inputSalaries.nextDouble();
	   	   	if(salary >= 0) 
	        {  
	        	 totalSalaries = totalSalaries + salary;
	        	 countNumSalaries++;
	        }
	      }
	   double averageSalaries = totalSalaries/countNumSalaries;
	   System.out.printf("The Average salary is : %,.2f. ", averageSalaries);

	}

}
