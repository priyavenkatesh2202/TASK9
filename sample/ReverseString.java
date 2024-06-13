package sample;

public class ReverseString 
	{

	public static void main(String[] args)
	{
		   String str= "knowledge", revs="";
		   char ch;
			
			System.out.print("Enter the String: "+str);
			 
			System.out.println();
			
			for (int i=0; i<str.length(); i++)
			{
				ch= str.charAt(i); 
				revs= ch+revs; 
			}
			System.out.println("Reverse String: "+ revs);
			}
		

		
	}


