package com.redington.exercise;
import java.util.Scanner;
import java.lang.Math;
public class Distance {
	
	int x1,x2,y1,y2;
	double d,d1,d2,d3;
	
	void display()
	{
		d1=(x2-x1)*(x2-x1);
		d2=(y2-y1)*(y2-y1);
		d3=d1+d2;
		d=Math.sqrt(d3);
		System.out.println("Distance between two points is:" +d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Distance value= new Distance();
	Scanner scan=new Scanner(System.in);
	System.out.println("************ DISTANCE BETWEEN TWO POINTS ************");
	System.out.println("Enter x1:");
	value.x1=scan.nextInt();
	System.out.println("Enter x2:");
	value.x2=scan.nextInt();
	System.out.println("Enter y1:");
	value.y1=scan.nextInt();
	System.out.println("Enter y2:");
	value.y2=scan.nextInt();
	value.display();
	}
 }
