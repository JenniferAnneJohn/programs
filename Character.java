package programs;

import java.util.Scanner;

public class Character {

	char value;
	

	
	public void getInput()
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("^^^^^^^ FINDING TYPE OF CHARACTER ^^^^^^^");
	System.out.println("Enter a character:");
	value=scan.next().charAt(0);
	
	
	}

	public void find()
	{
		
		
		 if(value>='A' && value<='Z')
		{
			System.out.println("It is a upper case alphabet");
			
		}
		else if(value>='a' && value<='z')
		{
			System.out.println("It is a small case alphabet");
		}
		else if(value>='0'&& value<='9')
		{
		    System.out.println("It is a number");
		}
		else
		{
			System.out.println("It is a special character");
		}
		
	}
		}




