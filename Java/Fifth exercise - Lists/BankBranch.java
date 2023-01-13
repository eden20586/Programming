// Name : Eden Admoni , Number Question : Question 5 , Name file : BankBranch.java
import java.util.ArrayList;
public class BankBranch {
	private String branchNumber;
	private String branchAdress;
	private ArrayList <BankAccount> accounts = new ArrayList <BankAccount>();
	
	/**
	 * @param branchNumber
	 * @param branchAdress
	 */
	public BankBranch(String branchNumber, String branchAdress) {
		this.branchNumber = branchNumber;
		this.branchAdress = branchAdress;
	} 

	public void addAccount(BankAccount account)
	{
		accounts.add(account);
	}

	public BankAccount findAccount(String accountNumber)
	{
	   for(BankAccount acc: accounts)
	   {
		if(accountNumber.equals(acc.getAccountNumber()))
	      {
	        return acc;
	      }		
	   }
	   return null;
	}

	public boolean deposit(String accountNumber, double amount)
	{
		BankAccount acc = findAccount(accountNumber);
		if(acc != null)
		{
			return acc.deposit(amount);
		}		
		else
		{
			return false;
		}
	}
	

	public boolean withdraw(String accountNumber, double amount)
	{
		BankAccount acc = findAccount(accountNumber);
		if(acc != null)
		{
			return acc.withdraw(amount);
		}		
		else
		{
			return false;
		}
	}

	public boolean transfer(String fromAccountNumber, String toAccountNumber, double amount)
	{
		BankAccount fromAccount = findAccount(fromAccountNumber);
		BankAccount toAccount = findAccount(toAccountNumber);

		if(fromAccount != null && toAccountNumber != null && fromAccount.withdraw(amount) == true)
		{
			return toAccount.deposit(amount);
		}		
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		String totalString = "";
		int countAccounts = 0;
		double totalBalance = 0;
		for(BankAccount acc: accounts)
		{
			countAccounts ++ ;
			totalBalance = totalBalance + acc.getBalance();
			totalString += "\n" + acc.toString();
		}
		return String.format("-----------------------------------------------------\n" +
		 "Branch Number = %6s , Branch Adress = %6s\n" + "-----------------------------------------------------\n"
		 + "Accounts details : \n%s\n" + "-----------------------------------------------------\n" +
		 "Number of accounts: %d\nTotal balance:%,.2f\n" + "-----------------------------------------------------\n", branchNumber ,branchAdress , totalString , countAccounts , totalBalance); 
	}

	public String accountsInDebt()
	{
		String totalString = "";
		int countAccounts = 0;
		double totalBalance = 0;
		for(BankAccount acc: accounts)
		{
			if(acc.getBalance() < 0)
			{
				countAccounts ++ ;
				totalBalance = totalBalance + acc.getBalance();
				totalString += "\n" + acc.toString();
			}
		}
		return String.format("-----------------------------------------------------\n" +
		 "Branch Number = %6s , Branch Adress = %6s\n" + "-----------------------------------------------------\n"
		 + "Accounts in debt : %s\n" + "-----------------------------------------------------\n" +
		 "Number of accounts in debt: %d\nTotal balance of accounts in debt: %,.2f", branchNumber ,branchAdress , totalString , countAccounts , totalBalance); 
	}
}

