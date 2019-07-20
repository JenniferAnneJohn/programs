package com.redington.exe3;

import java.util.Scanner;

public class BiggestNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
BiggestNumber obj=new BiggestNumber();

Scanner scan=new Scanner(System.in);
System.out.println("########## BIGGEST AMONG THREE NUMBERS ##########");
System.out.println("Enter number1: ");
int num1=scan.nextInt();
System.out.println("Enter number2: ");
int num2=scan.nextInt();
System.out.println("Enter number3: ");
int num3=scan.nextInt();

int r =obj.big(num1, num2, num3);
System.out.println("The biggest among the three numbers is :");
System.out.println(r);


	}

}
