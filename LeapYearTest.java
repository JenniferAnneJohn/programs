package com.redington.exercise2;

import java.util.Scanner;

public class LeapYearTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYear c=new LeapYear();
				
		Scanner scan=new Scanner(System.in);
		System.out.println("***** Leap Year & Non Leap Year Program *****");		
		System.out.println("Enter the year: ");
        int year=scan.nextInt();

    String res=c.findyear(year);
    System.out.println("The given year is "+res);
	}

}
