package Excercise2;

import java.util.Scanner;

public class NEvenNumbersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("##### ADDITION OF N EVEN NUMBERS #####");
		System.out.println("Enter n value: ");
		int n=scan.nextInt();
		NEvenNumbers even=new NEvenNumbers();
		int result=even.addNumbers(n);
		System.out.println("OUTPUT:");
		System.out.println("The addition of n Even Numbers is: "+result);
	}
}
