// Name : Eden Admoni , Number Question : Question 1 , Name file : CheckingAccount.java
public class CheckingAccount {

	static final double DEFAULT_TRANSACTION_FEE = 1.75; // א סעיף
	static final double DEFAULT_INITIAL_BALANCE = 0; // ב סעיף

	private	String acoountNum ; // ג סעיף
	private	String customerName ; // ד סעף
	private double balance ; // ה סעיף
	private double transactionFee; // ו סעיף
	
	//build method one : ז סעיף
	/**
	 * @param acoountNum
	 * @param customerName
	 * @param balance
	 * @param transactionFee
	 */
	public CheckingAccount(String acoountNum, String customerName, double balance, double transactionFee) {
		this.acoountNum = acoountNum;
		this.customerName = customerName;
		this.balance = balance;
		this.transactionFee = transactionFee;
	}

	// build method two : ח סעיף
	/**
	 * @param acoountNum
	 * @param customerName
	 */
	public CheckingAccount(String acoountNum, String customerName) {
		this.acoountNum = acoountNum;
		this.customerName = customerName;
		
		this.balance = DEFAULT_INITIAL_BALANCE; // = 0
		this.transactionFee = DEFAULT_TRANSACTION_FEE;} // = 1.75
	
	//method witdraw : ט סעיף
	
	public void withdraw(double amount) {
		balance = balance - amount - transactionFee ;
	}

	
	//method deposit : י סעיף
	
	public void deposit(double amount) {
		balance = balance + amount - transactionFee ;}

	// method toString : א"י סעיף
	
	@Override
	public String toString() {
		return "CheckingAccount [acoountNum=" + acoountNum + ", customerName=" + customerName + ", balance=" + balance
				+ ", transactionFee=" + transactionFee + "]";
	
	
	
	}	

}
