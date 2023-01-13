// Name : Eden Admoni , Number Question : Question 1 , Name file : CheckingAccount.java
public class CheckingAccount {

	static final double DEFAULT_TRANSACTION_FEE = 1.75; // � ����
	static final double DEFAULT_INITIAL_BALANCE = 0; // � ����

	private	String acoountNum ; // � ����
	private	String customerName ; // � ���
	private double balance ; // � ����
	private double transactionFee; // � ����
	
	//build method one : � ����
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

	// build method two : � ����
	/**
	 * @param acoountNum
	 * @param customerName
	 */
	public CheckingAccount(String acoountNum, String customerName) {
		this.acoountNum = acoountNum;
		this.customerName = customerName;
		
		this.balance = DEFAULT_INITIAL_BALANCE; // = 0
		this.transactionFee = DEFAULT_TRANSACTION_FEE;} // = 1.75
	
	//method witdraw : � ����
	
	public void withdraw(double amount) {
		balance = balance - amount - transactionFee ;
	}

	
	//method deposit : � ����
	
	public void deposit(double amount) {
		balance = balance + amount - transactionFee ;}

	// method toString : �"� ����
	
	@Override
	public String toString() {
		return "CheckingAccount [acoountNum=" + acoountNum + ", customerName=" + customerName + ", balance=" + balance
				+ ", transactionFee=" + transactionFee + "]";
	
	
	
	}	

}
