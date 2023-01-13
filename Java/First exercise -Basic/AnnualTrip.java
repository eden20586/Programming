// Name : Eden Admoni , Number Question : Question 1 , Name file : AnnualTrip.java
import java.util.Scanner;
public class AnnualTrip {

	public static void main(String[] args) {
		Scanner input_pupils_in_the_trip = new Scanner(System.in); 
		System.out.print("Please enter the number of the pupils that going to the trip : " );
		int pupils_in_the_trip = input_pupils_in_the_trip.nextInt();
		
		Scanner input_bus_capacity = new Scanner(System.in);
		System.out.print("Please enter the bus capacity : " ); 
		int bus_capacity = input_bus_capacity.nextInt();
		
		int number_of_full_buses = pupils_in_the_trip/bus_capacity;
		System.out.println("The Number of the full buses are : " + number_of_full_buses ); 
		
		int Number_of_the_pupils_in_the_other_bus = pupils_in_the_trip%bus_capacity;
		System.out.print("The Number of the pupils in the last bus are : " + Number_of_the_pupils_in_the_other_bus ); 

	}

}
