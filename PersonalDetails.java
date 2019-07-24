package exerciseprgms;
import java.util.Scanner;
public class PersonalDetails {
	String name;
	long rollno;
	String fieldofinterest;
	
	void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("***** PERSONAL DETAILS *****");
		System.out.println("Enter name");
		name=scan.next();
		System.out.println("Enter rollno");
		rollno=scan.nextLong();
		System.out.println("Enter field");
		fieldofinterest=scan.next();
		
	}
	void display()
	{
		System.out.println("OUTPUT: ");
		System.out.println("Hello my name is " +name+ " and my roll number is " +rollno+".My field of interest is " +fieldofinterest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonalDetails obj=new PersonalDetails();
		obj.getInput();
		obj.display();

	}

}
