package assessment1;
import java.util.Scanner;

public class IntegerNumber {
	
	 private boolean b=true;
	 private int count=0;
	 private int number,sum=0;
	 private float average;
	 private char c;
	
public void getInput()
{
	while(b)
	{		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		number=scan.nextInt();
		
		System.out.println("Do you want to continue(y/n)? ");
		c=scan.next().charAt(0);
		count++;	
		sum=sum+number;	
			
		if(c=='n')
		{
			b=false;
			System.out.println();
		}
	}
		System.out.println("******* OUTPUT *******");
		System.out.println("Count value:"+count);
		System.out.println("The sum of the numbers are: "+sum);
			
}
public void avg()
{
	average=(float)sum/count;
	System.out.println("The average of the numbers is: "+average);
}

}




