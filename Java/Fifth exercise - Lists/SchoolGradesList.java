// Name : Eden Admoni , Number Question : Question 4 , Name file : SchoolGradesList.java
import java.util.ArrayList;
public class SchoolGradesList {
	private ArrayList<Integer> gradesList = new ArrayList <Integer>();
	private ArrayList<Integer> frequencies  = new ArrayList <Integer>();

	public void addGrade(int grade)
	{
			if(grade >= 0 && grade <= 10)
			{
				gradesList.add(grade);
			}
			else
			{
				System.out.println("Error , the grade is invalid , please enter grade in the range 0-10");
			}
	}
		
	
	public void printGradesDistribution()
	{
		String countStars = "" ;
		System.out.println("Print Grade List");
		System.out.println("Grade              Frequency              Histogram");
		
		for(int i = 0; i <= 10; i++)
		{
			frequencies.add(0);
		}
			
			for(int i = 0; i <= 10;i++)
			{
				System.out.printf("%2d" , i);
					for(int grade:gradesList)
					{
						if(grade == i)
						{
							frequencies.set(i , frequencies.get(i) + 1);
							countStars +="*";
						}
					}
					System.out.printf("                  %3d                   %s\n"  ,frequencies.get(i) , countStars  );
					countStars ="";

			}						

	}
}

