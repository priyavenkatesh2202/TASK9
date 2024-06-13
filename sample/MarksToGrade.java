package sample;
import java.util.Scanner;
public class MarksToGrade {
	

	public static void main(String[] args)
	{
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the marks:");
		int m =input.nextInt();
		
		
		
		if(m == 100)               // nested if for the grade to be assigned for corresponding mark
		{
			System.out.println( "S");
		}
		else if(m <= 99 && m >= 90)
		{
			System.out.println( "A");
		}
		else if (m <=89 && m>=80)
		{
			System.out.println( "B");
		}
		else if(m <=79 && m>=70)
		{
			System.out.println( "C");
		}
		else if(m <=69 && m>=60)
		{
			System.out.println("D");
		}
		else if(m<=59 && m>=50)
		{
			System.out.println("E");
		}
		else if(m<50)
		{
			System.out.println("F");
		}
		
		else if (m >100)
		{
			System.out.println("invalid input");
		}
			
		
		// TODO Auto-generated method stub

	}

}
