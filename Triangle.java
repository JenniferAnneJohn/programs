package com.redington.exercise;
import java.util.Scanner;
public class Triangle {
int base;
int height;
double area;
void areaOfTriangle()
{
	area=0.5*base*height;
	System.out.println("Area of a triangle is: "+area);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Triangle a1=new Triangle();
	Scanner scan=new Scanner(System.in);
	System.out.println("********** AREA OF TRIANGLE **********");
	System.out.println("Enter base value :");
	a1.base=scan.nextInt();
	System.out.println("Enter height value: ");
	a1.height=scan.nextInt();
	a1.areaOfTriangle();
	}
	}
