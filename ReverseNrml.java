package com.redington.exercise;

import java.util.Scanner;
public class ReverseNrml {
int number;


void output()
{
	System.out.println("*********** REVERSE ORDER ***********");
	System.out.println("The numbers are in the reverse order:");
	for(number=500;number>=450;number--)
	{
	System.out.println(number);
	}
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNrml num=new ReverseNrml();
		//num.getInput();
		num.output();
		

	}

}
