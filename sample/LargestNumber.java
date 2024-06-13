package sample;
import java.util.Scanner;  
public class LargestNumber {

	public static void main(String[] args)
	{
		
		
		
		System.out.println("Enter three integers: ");  // scanner input for three integer
		Scanner in = new Scanner(System.in);  
		int num1=in.nextInt();  
		int num2=in.nextInt();  
		int num3=in.nextInt();
		
		
		if (num1 > num2 && num1 > num3)  
		System.out.println("The largest number is: "+num1);  // comparing num1 with num2 & num3
		
		
		else if (num2 > num1 && num2 > num3)  
		System.out.println("The largest number is: "+num2); // comparing num2 with num1 & num3
		
		
		else if (num3 > num1 && num3 > num2)  
		System.out.println("The largest number is: "+num3);  // comparing num3 with num1 & num2
		 
		}  
		
		// TODO Auto-generated method stub

	}


