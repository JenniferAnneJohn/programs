package com.redington.exercise2;

public class LeapYear {

	
public	String findyear(int year)
	{
		String out=" ";
	
	if(year%4==0)
	{
		out="a Leap Year";
	}
	else{
		out="a Non-Leap Year";
	}
return out;
	}


}