// First name : Eden , Last Name : Admoni , Number Question : Question 2 , Name file : BookOrder.java
import java.util.ArrayList;
public class BookOrder {
	final int SHIPINGCOST = 15;
	
	private int orderNumber;
	private String date;
	private ArrayList<Book> books = new ArrayList<Book>();
	/**
	 * @param orderNumber
	 * @param date
	 */
	public BookOrder(int orderNumber, String date) {
		this.orderNumber = orderNumber;
		this.date = date;
	}
	
	public void addBook(Book book)
	{
		books.add(book);
	}
	
	public double getSubTotal()
	{
		double totalPrices = 0;
		for(Book boook:books)
		{
			totalPrices += boook.getPrice();
		}
		return totalPrices;
	}

	public double getShippingCost()
	{
		double shippingCost = 0;
		return shippingCost = books.size() * SHIPINGCOST;
	}

	public double getGrandTotal()
	{
		double totalPayment = getShippingCost() + getSubTotal();
		return totalPayment;
	}

	public String toString()
	{
		String totalString = "Order : " + orderNumber + " " + "Date : " + date + "\n" + "---------------------------------------\n";
		for(Book boook:books)
		{
			totalString += "\n" + boook.toString();
		}
		return totalString += "---------------------------------------\n" + "Sub-Total     : " + getSubTotal() + "\n" + "Shipping cost : " +  getShippingCost() + "\nGrand Total   : " + getGrandTotal();  
	}
}
