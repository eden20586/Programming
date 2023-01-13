// Name : Eden Admoni , Number Question : Question 5 , Name file : BankBranchTester.java
import java.util.Scanner;
public class BankBranchTester {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		   
	   	final int CREATE_ACCOUNT			= 1;
		final int FIND_ACCOUNT 				= 2;
		final int DEPOSIT 					= 3;
		final int WITHDRAW					= 4;
		final int TRANSFER					= 5;
		final int PRINT_ALL_ACCOUNTS		= 6;
		final int PRINT_ACCOUNTS_IN_DEBT	= 7;
		final int QUIT						= -1;
		
	    BankBranch branch = new BankBranch("987", "Havazelet 10 TA");
	      boolean done = false;
	      while(!done)
	      {
	    	  System.out.printf("Please choose action:\n");
	    	  System.out.printf("%3d - create account\n", CREATE_ACCOUNT);
	    	  System.out.printf("%3d - print account details\n", FIND_ACCOUNT);
	    	  System.out.printf("%3d - deposit\n", DEPOSIT);
	    	  System.out.printf("%3d - withdraw\n", WITHDRAW);
	    	  System.out.printf("%3d - transfer\n", TRANSFER);
	    	  System.out.printf("%3d - print all accounts\n", PRINT_ALL_ACCOUNTS);
	    	  System.out.printf("%3d - print accounts in debt\n", PRINT_ACCOUNTS_IN_DEBT);
	    	  System.out.printf("%3d - quit\n", QUIT);
	    	  
	    	  System.out.print("Your choice : ");
	    	  
		  
	    	  int action = inScanner.nextInt();
	    	  if(action == CREATE_ACCOUNT)
	    	  {
	    		  System.out.printf("Please enter the new account details:\n");
	    		  System.out.printf("Account number:             ");
	    		  String accountNumber = inScanner.next();
	    		  System.out.printf("Customer name:              ");
	    		  String customerName = inScanner.next();
	    		  System.out.printf("Initial balance:            ");
	    		  double initialBalance = inScanner.nextDouble();
	    		  System.out.printf("Minimal allowed balance:    ");
	    		  double minBalance = inScanner.nextDouble();

	    		  BankAccount newAccount = new BankAccount(accountNumber , customerName , initialBalance , minBalance);
	    		  branch.addAccount(newAccount);
	    		  System.out.println("Your account is created in succesful.");
	    	  }
	    	  else if(action == FIND_ACCOUNT)
	    	  {
	    		  System.out.printf("Please enter the account number:"); 
	    		  String accountNumber = inScanner.next();
	    		  BankAccount account = branch.findAccount(accountNumber);
	    		  if(account == null)
	    		  {
		    		  System.out.println("The account not found"); 
	    		  }
	    		  else
	    		  {
	    			  System.out.printf("Account details:\n%s " ,account.toString()+"\n"); 
	    		  }
	    		  
	    	  }
	    	  else if(action == DEPOSIT)
	    	  {
	    		  System.out.printf("Please enter the account number:"); 
	    		  String accountNumber = inScanner.next();
	    		  
	    		  System.out.printf("Please enter amount to deposit:"); 
	    		  double amount = inScanner.nextDouble();
	    		  
	    		  boolean isSuccessfull = branch.deposit(accountNumber, amount);
	    		  
	    		  if(isSuccessfull == true)
	    		  {
	    			  System.out.printf("Deposit of %,.2f to account %s succeeded.\n" , amount ,accountNumber);
	    		  }
	    		  else
	    		  {
	    			  System.out.printf("Deposit of %,.2f to account %s failed.\n" , amount ,accountNumber);
	    		  }
	    	  }
	    	  else if(action == WITHDRAW)
	    	  {
	       		  System.out.printf("Please enter the account number:"); 
	       		  String accountNumber = inScanner.next();
	    		  
	    		  System.out.printf("Please enter amount to witdraw:"); 
	    		  double amount = inScanner.nextDouble();
	    		  
	    		  boolean isSuccessfull = branch.withdraw(accountNumber, amount);
	    		  
	    		  if(isSuccessfull == true)
	    		  {
	    			  System.out.printf("Withdraw of %,.2f to account %s succeeded.\n" , amount ,accountNumber);
	    		  }
	    		  else
	    		  {
	    			  System.out.printf("Withdraw of %,.2f to account %s failed.\n" , amount ,accountNumber);
	    		  }
	       	  }
	    	  else if(action == TRANSFER)
	    	  {
	       		  System.out.printf("Transfer from account : "); 
	    		  String accountFrom = inScanner.next();
	    		  
	    		  System.out.printf("Transfer to account   : "); 
	    		  String accountTo = inScanner.next();
	    		  
	    		  System.out.printf("Amount to transfer    : "); 
	    		  double amount = inScanner.nextDouble();
	    		  
	    		  boolean isSuccessfull = branch.transfer(accountFrom, accountTo , amount);
	    		  
	    		  if(isSuccessfull == true)
	    		  {
	    			  System.out.printf("Transfer of %,.2f from account %s to account %s succeeded.\n" , amount ,	accountFrom , accountTo);		  
	    		  }
	    		  else
	    		  {
	    			  System.out.printf("Transfer of %,.2f from account %s to account %s failed.\n" , amount ,	accountFrom , accountTo);		 
	    		  }
	       	  }
	    	  else if(action == PRINT_ALL_ACCOUNTS)
	    	  {
	    		System.out.println(branch.toString());	    	 
	    	  }
	    	  else if(action == PRINT_ACCOUNTS_IN_DEBT)
	    	  {
		    	System.out.println(branch.accountsInDebt());	    	 
	    	  }
	    	  else if(action == QUIT)
	    	  {
	    		  done = true;
	    		  System.out.printf("Goodby !\n");  
	    	  }
	    	  else
	    	  {
	    		  System.out.printf("Incorrect input. Please try again\n");
	    	  }
	      }
	}
}
