package Excercise2;

import java.util.Scanner;

public class AddOddNumbersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("***** ADDITION OF N ODD NUMBERS *****");
		System.out.println("Enter n value: ");
		int n=scan.nextInt();
		AddOddNumbers add=new AddOddNumbers();
		
		int result=add.addNumbers(n);
		System.out.println("OUTPUT:");
		System.out.println("The addition of n Odd Numbers is: "+result);

	}

}
