// Name : Eden Admoni , Number Question : Question 1 , Name file : Investment.java
public class Investment {
	// variables
	private double balance;
	private double rate;
	private int year;
	
	//bulider
	/**
	 * @param balance
	 * @param rate
	 */
	public Investment(double balance, double rate) {
		this.balance = balance;
		this.rate = rate;
		
		this.year = 0;
	}
	
	// build method waitForBalance with while loop
	
	public void waitForBalance(double targetBalance) {
		while(balance < targetBalance) {
			balance = balance * (1+ (rate/100));
			year ++; // = year = year + 1 - שנה להוספת קיצור
		}
		}

	// build method waitYears with for loop
	
	public void waitYears(int numberOfYears) {
		for(int years = 1; years <= numberOfYears; years++)
		{
			balance = balance * (1+ (rate/100));
			year = years;
		}
	}
	
	// get method return balance
	
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	// get method return year
	
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	// tostring method 
	
	public String toString() {
		return "Investment [balance=" + balance + ", rate=" + rate + ", year=" + year + "]";
	}
}
