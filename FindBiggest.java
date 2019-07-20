package com.redington.exercise;
import java.util.Scanner;
public class FindBiggest {
	int number1;
	int number2;
	void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("************* BIGGEST NUMBER *************");
		System.out.println("Enter number 1: ");
		number1=scan.nextInt();
		System.out.println("Enter number 2: ");
		number2=scan.nextInt();	
	}
	void findBiggestNumber()
	{
		System.out.println("  OUTPUT  ");
		if(number1>number2)
		{
			System.out.println("The biggest number is :" +number1);
					}
		else
		{
			System.out.println(number2+ " is the biggest number");
			
		}
	}

}
