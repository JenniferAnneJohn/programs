package com.redington.exercise;
import java.util.Scanner;
public class OddOrEven {
int number;
void getInput()
{
	
	Scanner scan=new Scanner(System.in);
	System.out.println("********** ODD OR EVEN NUMBER **********");
	System.out.println("Enter number:");
	number=scan.nextInt();
}

void cal()
{
if(number%2==0)
{
	System.out.println(number+ " is an even number");
}
else
{
	System.out.println(number+ " is an odd number");
}
}
	
public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		OddOrEven numb=new OddOrEven();
		numb.getInput();
		numb.cal();
	}

}
