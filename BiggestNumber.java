package com.redington.exe3;

public class BiggestNumber {
	
	int result;
	 
	public int big(int a,int b,int c)
	{
		int biggest;
		if(a>b && a>c)
		{
			biggest=+a;
			
		}
		else if(b>a && b>c)
		{
			biggest=+b;
			
		}else{
			biggest=+c;
		}
		
		return biggest;
	}

}

