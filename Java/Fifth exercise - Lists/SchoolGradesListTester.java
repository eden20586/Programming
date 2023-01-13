// Name : Eden Admoni , Number Question : Question 4 , Name file : SchoolGradesListTester.java
import java.util.Scanner;
public class SchoolGradesListTester {

	public static void main(String[] args) {
		SchoolGradesList gradesList = new SchoolGradesList();
		Scanner inputGrade = new Scanner(System.in);
		System.out.println("Please enter a grade , Q to quit : ");
		while(inputGrade.hasNextInt())
		{
			int newGrade = inputGrade.nextInt();
			gradesList.addGrade(newGrade);
		}
		
		gradesList.printGradesDistribution();
	}

}
