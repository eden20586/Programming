// Name : Eden Admoni , Number Question : Question 2 , Name file : CheckingAccountTester.java
import java.util.Scanner;
public class CheckingAccountTester {

	public static void main(String[] args) {
		//א סעיף
		Scanner input_accountNum = new Scanner(System.in);
		System.out.print("Please enter the account number : ");
		String accountNum = input_accountNum.next();
		
		Scanner input_customerName = new Scanner(System.in);
		System.out.print("Please enter the customer name : ");
		String customerName = input_customerName.next();
		
		Scanner input_balance = new Scanner(System.in);
		System.out.print("Please enter the initial balance : ");
		double balance = input_balance.nextDouble();
		
		Scanner input_transactionFee = new Scanner(System.in);
		System.out.print("Please enter the transactionFee : ");
		double transactionFee = input_transactionFee.nextDouble();
		
		// ב סעיף
		CheckingAccount alicesAccount = new CheckingAccount(accountNum, customerName, balance ,transactionFee);
		
		// ג סעיף
		System.out.println("First account created in success");
		System.out.println("The first account details are : " + alicesAccount.toString());

		// ד סעיף
		System.out.print("Please enter the account number : ");
		String accountNum2 = input_accountNum.next();
		
		System.out.print("Please enter the customer name : ");
		String customerName2 = input_customerName.next();

		// ה סעיף
		CheckingAccount bobsAccount = new CheckingAccount(accountNum2, customerName2);
		
		// ו סעיף
		System.out.println("Second account created in success");
		System.out.println("The second account details are : " + bobsAccount.toString());	
		
		// ז סעיף
		Scanner input_amount_transfer = new Scanner(System.in);
		System.out.print("Please enter the amount to transfer : ");
		double amount = input_amount_transfer.nextDouble();
	
		alicesAccount.withdraw(amount); 
		bobsAccount.deposit(amount);
		
		// ח סעיף
		System.out.println("Amount of " + amount + " NIS is transfered from the first to the second account.");
		System.out.println("Accounts details : ");
		System.out.println(alicesAccount.toString());
		System.out.print(bobsAccount.toString());
	}

}
