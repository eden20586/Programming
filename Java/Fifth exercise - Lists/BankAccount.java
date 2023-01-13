// Name : Eden Admoni , Number Question : Question 5 , Name file : BankAccount.java
public class BankAccount {
	private String accountNumber;
	private String customerName;
	private double balance;
	private double minBalance;
	/**
	 * @param accountNumber
	 * @param customerName
	 * @param balance
	 * @param minBalance
	 */
	public BankAccount(String accountNumber, String customerName, double balance, double minBalance) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
		this.minBalance = minBalance;
	}
	
	public boolean deposit(double amount)
	{
		balance += amount;
		return true;
	}
	
	public boolean withdraw(double amount)
	{
		if((balance - amount) < minBalance  )
		{
			return false;
		}
		else
		{
			balance = balance - amount;
			return true;
		}
	}

	public String getAccountNumber()
	{
		return accountNumber;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
		
	@Override
	public String toString() {
		return String.format("Account Number = %6s\nCustomerName   = %6s\nBalance        = %,.2f\nMinBalance     = %,.2f\n\n",
				accountNumber, customerName, balance, minBalance);
	}

	
	
}
