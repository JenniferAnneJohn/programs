package exercise3;

public class SmallestNumber {
	public String small(int number1,int number2,int number3)
	{
		String result=" ";
		if(number1<number2 && number1<number3)
		{
			result="The smallest number is: "+number1;
			
		}
		if(number2<number1 && number2<number3)
		{
			result="The smallest number is: "+number2;
			
		}
		else if(number3<number1 && number3<number2){
			result="The smallest number is: "+number3;
			
		}
		return result;
	}
}
