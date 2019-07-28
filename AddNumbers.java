package Excercise2;

import java.util.Scanner;

public class AddNumbers {
int i,n,num;

void getInput()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("******* ADDITION OF N NUMBERS *******");
	System.out.println("Enter n value: ");
	n=scan.nextInt();
}

 public int addNumbers()
{
	num=0;
	for(i=1;i<=n;i++)
	{
		num=num+i;
	}
	return num;	
}
}
