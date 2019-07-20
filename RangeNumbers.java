package com.redington.exercise;

public class RangeNumbers {
	int i;
	void range()
	{
		System.out.println("********* PRINTING NUMBERS BETWEEN A RANGE *********");
		System.out.println("The numbers are:");
		for(i=100;i<=150;i++)
		{
			
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RangeNumbers a=new RangeNumbers();
		a.range();

	}

}
