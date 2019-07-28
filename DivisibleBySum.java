package assessment1;
import java.util.Scanner;

public class DivisibleBySum {
private int n;
private int sum,a,b;
private int remainder,division;

public void getInput()
{	
	Scanner scan=new Scanner(System.in);
	System.out.println("******* NUMBER DIVISIBLE BY SUM OF ITS DIGITS *******");
	System.out.println("Enter a number: ");
	n=scan.nextInt();
	a=n;
}

public void sum()
{
	sum=0; 
	while(n>0)
	{
		
		remainder=n%10;
		sum=sum+remainder;
		n=n/10;
	}	
	b=sum;
}
	
	void dis()
	{	
		division=a%b;
		if(division==0)
		{
			System.out.println("OUTPUT: "+a+" is divisible by sum of its digits "+b);
		}
		else
		{
			System.out.println("OUTPUT: "+a+" is not divisible by sum of its digits "+b);
		}
	}
}







