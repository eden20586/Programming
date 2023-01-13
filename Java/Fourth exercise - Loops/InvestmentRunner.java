// Name : Eden Admoni , Number Question : Question 1 , Name file : InvestmentRunner.java
public class InvestmentRunner {

	public static void main(String[] args) {
		Investment investment1 = new Investment(10000 , 5); // builderOne 
		Investment investment2 = new Investment(10000 , 5); // builderTwo

		investment1.waitYears(20);// waitYears method
		System.out.printf(" === Expected output : balance : %,.2f NIS , years : %d ===\n" , investment1.getBalance() , investment1.getYear());
		System.out.printf("Investment 1: The balance after %d years is  : %,.2f\n" ,investment1.getYear() , investment1.getBalance() );
		
		investment2.waitForBalance(50000);// waitForBalance method
		System.out.printf(" === Expected output : balance : %,.2f NIS , years : %d ===\n" , investment2.getBalance() , investment2.getYear());
		System.out.printf("Investment 2: The balance after %d years is  : %,.2f " ,investment2.getYear() , investment2.getBalance() );
	}

}
