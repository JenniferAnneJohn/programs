package Excercise2;
import java.util.Scanner;

public class AddOddNumbers {
	int n,i,odd;
	
  public int addNumbers(int n)
	{
		for(i=1;i<=n;i=i+2)
		{
			odd=odd+i;
		}
		return odd;	
      }
}
