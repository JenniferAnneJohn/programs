package com.redington.exercise;
import java.util.Scanner;
public class Slope {
	int y1,y2,x1,x2,x,y;
	int m;
	void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("******* SLOPE OF A LINE *******");
		System.out.println("Enter x1:");
		x1=scan.nextInt();
		System.out.println("Enter x2:");
		x2=scan.nextInt();
		System.out.println("Enter y1:");
		y1=scan.nextInt();
		System.out.println("Enter y2:");
		y2=scan.nextInt();
	}
	void findSlope()
	{
		x=x2-x1;
		y=y2-y1;
		m=y/x;
		System.out.println("Slope of a line is : " +m);
		
	}

}
