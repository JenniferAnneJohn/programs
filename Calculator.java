package com.redington.exercise;
import java.util.Scanner;
import java.lang.Math;
public class Calculator {
	int number1,number2;
	double result;
	void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("************** CALCULATOR **************");
		System.out.println("Enter number 1: ");
		number1=scan.nextInt();
		System.out.println("Enter number 2: ");
		number2=scan.nextInt();
	}
	void add()
	{
		result=number1+number2;
		System.out.println("Addition is : " +result);
	}
	void sub()
	{
		result=number1-number2;
		System.out.println("Subtraction is : " +result);
	}
	void mul()
	{
		result=number1*number2;
		System.out.println("Multiplication is : " +result);
	}
	void div()
	{
		result=number1/number2;
		System.out.println("Division is : " +result);
	}
	void remainder()
	{
		result=number1%number2;
		System.out.println("Remainder is : " +result);
	}
	void square()
	{
		result=number1*number1;
		System.out.println("Square value is : " +result);
	}
	void cube()
	{
		result=number1*number1*number1;
		System.out.println("Cube value is : " +result);
	}
	void sqroot()
	{
		result=Math.sqrt(number1);
		System.out.println("Square root value is : " +result);
	}
	
	
}
