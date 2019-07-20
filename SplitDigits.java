package com.redington.exe3;

import java.util.Scanner;

public class SplitDigits {

	int number,remainder;
	
	void get()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("$$$$$$$$ SPLITTING OF DIGITS $$$$$$$$");
		System.out.println("Enter a number: ");
		number=scan.nextInt();
	}
	
	void split()
	{
		System.out.println("OUTPUT:");
		while(number>0)
		{
			remainder=number%10;
		System.out.println(remainder);
		number=number/10;
	}
	}
}
