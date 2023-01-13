// First name : Eden , Last Name : Admoni , Number Question : Question 2 , Name file : Book.java
public class Book {
	final int NUMPAGESFORFIRSTPRICE = 500;
	final double FIRSTPRICE = 0.1;
	final double SECONDPRICE = 0.04;

	private String title;
	private String author;
	private int numPages;
	/**
	 * @param title
	 * @param author
	 * @param numPages
	 */
	public Book(String title, String author, int numPages) {
		this.title = title;
		this.author = author;
		this.numPages = numPages;
	}

	public double getPrice()
	{
		double price = 0;
		if(numPages > NUMPAGESFORFIRSTPRICE)
		{
			return price += NUMPAGESFORFIRSTPRICE * FIRSTPRICE + (numPages - NUMPAGESFORFIRSTPRICE) * SECONDPRICE;
		}
		else
		{
			return price += numPages * FIRSTPRICE;
		}
	}

	@Override
	public String toString() {
		return String.format("Book :\nTitle = %s\nAuthor = %s\nNumber pages = %d\nPrice = %,.2f\n", title, author, numPages,
				getPrice());
	}
	
	
	
	
	
}
