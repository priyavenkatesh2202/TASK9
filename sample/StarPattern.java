package sample;
import java.util.Scanner;
public class StarPattern {

	public static void main(String[] args) {
			 
		    System.out.print("Enter the size of the cross: ");
		
		    
		    Scanner scanner = new Scanner(System.in); 
		    int size = scanner.nextInt(); 
	        
	        

	        for(int i = 1; i <= size; i++) 
	        
	        { 
	            for(int j = 1; j <= size; j++)
	            { 
	                
	            	if(i == j || j == (size - i + 1)) 
	            	{ 
	                    System.out.print("*"); 
	                }
	            	
	            	else 
	            	{
	                    System.out.print(" "); 
	                }
	            }
	            
	          
	            System.out.println(); 
	        }
	        
			}
			}
		
		
		
	


