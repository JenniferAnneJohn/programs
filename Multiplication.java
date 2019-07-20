package com.redington.exercise;

public class Multiplication {
int no1;
int no2=4;
int result;
void calculate()
{
System.out.println("*************** MULTIPLICATION TABLE ***************");	
	for(no1=1;no1<=10;no1++)
	{
		result=no1*no2;
		System.out.println(+no1+"x"+no2+"="+result);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplication a=new Multiplication();
		a.calculate();

	}

}
