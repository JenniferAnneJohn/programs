package exerciseprgms;
import java.util.Scanner;
public class Average {
	
	int number1,number2,number3;
	int sum;
	float avg;
	
	void input()
	{
		System.out.println("********** AVERAGE **********");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number 1: ");
		number1=scan.nextInt();
		System.out.println("Enter number 2: ");
		number2=scan.nextInt();
		System.out.println("Enter number 3: ");	
		number3=scan.nextInt();
	}
	
	void sum()
	{
	
	sum=number1+number2+number3;
	System.out.println("The sum is: "+sum);
	}
	
	void avg()
	{
		avg=sum/3;
		System.out.println("Average is: "+avg);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Average a1=new Average();
a1.input();
a1.sum();
a1.avg();
	}

}
