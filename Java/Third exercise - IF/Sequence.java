// Name : Eden Admoni , Number Question : Question 2 , Name file : Sequence.java
import java.util.Scanner;
public class Sequence {

	public static void main(String[] args) {
		Scanner input_words = new Scanner(System.in);
		System.out.print("Please enter three words : ");
		String first_word = input_words.next();
		String second_word = input_words.next();
		String third_word = input_words.next();
		
		int result_one = first_word.compareTo(second_word);
		int result_two = second_word.compareTo(third_word);

		if((result_one <= 0 && result_two <= 0) || (result_one >= 0 && result_two >= 0))
		{
		
			System.out.printf("The words %s , %s and %s are in order. " , first_word , second_word , third_word );
		}
		else 
			System.out.printf("The words %s , %s and %s are NOT in order.  " , first_word , second_word , third_word );
}
}
