package assessment1;


import java.util.Scanner;

public class FactorsOfANumber {

	private int number;
	private int factors;
	
	public void getInput()
	{
		System.out.println("******** FACTORS OF A NUMBER ********");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		number=scan.nextInt();
	}
	public void display()
	{
		System.out.println("******** OUTPUT ********");	
		System.out.println("The factors of the given number "+number+ " is :" );
				
			int i;
			for(i=1;i<number;i++)
			{
			factors=number%i;
			//System.out.println(factors);
			if(factors==0)
			{
				System.out.println(i);
			}
			}
		
		}	
		
		
}



