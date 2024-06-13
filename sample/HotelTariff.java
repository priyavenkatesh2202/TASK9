package sample;
import java.util.Scanner;
public class HotelTariff {



		public static void main(String args[])

		{

		    Scanner sc=new Scanner(System.in);
		    
		    System.out.println("Enter the month integer:");
		    int m=sc.nextInt(); // input for month
		    
		    System.out.println("Enter the tariff:");
		    float r=sc.nextFloat(); //input for the rent
		    
		    System.out.println("Enter the no of days:");
		    int d=sc.nextInt(); // input for number of days  
		    float t=r*d;   // tariff calculated with rent input and no of days stayed
            
		    double tr=(1.2)*r*d; // 20% high during peak
		
		    
		    switch(m)

		    {

		        case 1:

		                System.out.printf("%.2f",t); // jan month does'nt increase 20% high in rent
		                						// used to format the output of numbers and strings

		                break;

		        case 2:

		                System.out.printf("%.2f",t); // feb month does'nt increase 20% high in rent

		                break;

		        case 3:

		                System.out.printf("%.2f",t); // mar month does'nt increase 20% high in rent

		                break;

		        case 4:

		                System.out.printf("%.2f",tr);// Apr month increase 20% high in rent

		                break;

		        case 5:

		                System.out.printf("%.2f",tr); // may month increase 20% high in rent

		                break;

		        case 6:

		                System.out.printf("%.2f",tr); // june month increase 20% high in rent

		                break;

		        case 7:

		               System.out.printf("%.2f",t); // july month does'nt increase 20% high in rent

		               break;

		        case 8:

		                System.out.printf("%.2f",t);//aug month does'nt increase 20% high in rent

		                break;

		        case 9:

		                System.out.printf("%.2f",t);// sep month does'nt increase 20% high in rent

		                break;

		        case 10:

		                System.out.printf("%.2f",t);// oct month does'nt increase 20% high in rent

		                break;

		        case 11:

		                System.out.printf("%.2f",tr);// nov month increase 20% high in rent

		                break;

		        case 12:

		                System.out.printf("%.2f",tr);// dec month increase 20% high in rent

		                break;

		        default:

		            System.out.println("Invalid Input");

		       }

		    }

		
		// TODO Auto-generated method stub

	}


