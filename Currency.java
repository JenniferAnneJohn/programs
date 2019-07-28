package Excercise2;

import java.util.Scanner;

public class Currency {
	
	int choice;
	double currencyvalue,amount;
	
	void getDetails()
	{
	System.out.println("***********Equivalent Currency Value of Indian Rupee***********");
	System.out.println("The list of Countries are as follows: ");
	System.out.println("1. Armenia");
	System.out.println("2. Bangladesh");
	System.out.println("3. Cambodia ");
	System.out.println("4. China");
	System.out.println("5. Georgia ");
	System.out.println("6. Hong Kong");
	System.out.println("7. Indonesia ");
	System.out.println("8. Japan ");
	System.out.println("9. Malaysia");
	System.out.println("10. South Korea");
	System.out.println("11. Sri Lanka ");
	System.out.println("12. Philippines");
	System.out.println("13. Thailand ");
	System.out.println("14. Taiwan ");
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the choice of your country: ");
	choice=scan.nextInt();
	System.out.println("Enter amount: ");
	amount=scan.nextDouble();
	
	}
	
	
	void currency()
	{
		System.out.println("OUTPUT:");
		if(choice==1){
			currencyvalue=amount*0.1487;
			System.out.println("The currency value is: "+currencyvalue);
					}
		else if(choice==2){
			currencyvalue=amount*0.8572;
			System.out.println("The currency value is: "+currencyvalue);
					}
		if(choice==3){
			currencyvalue=amount*0.01758;
			System.out.println("The currency value is: "+currencyvalue);
					}
		else if(choice==4){
			currencyvalue=amount*10.513;
			System.out.println("The currency value is: "+currencyvalue);
					}
		if(choice==5){
			currencyvalue=amount*27.539;
			System.out.println("The currency value is: "+currencyvalue);
					}
		else if(choice==6){
			currencyvalue=amount*9.1813;
			System.out.println("The currency value is: "+currencyvalue);
					}
		 if(choice==7){
			currencyvalue=amount*0.005;
			System.out.println("The currency value is: "+currencyvalue);
								}	
		 else if(choice==8){
			currencyvalue=amount*0.6422;
			System.out.println("The currency value is: "+currencyvalue);
		}
		if(choice==9){
			currencyvalue=amount*17.412;
			System.out.println("The currency value is: "+currencyvalue);
					}
		else if(choice==10){
			currencyvalue=amount*0.0642;
			System.out.println("The currency value is: "+currencyvalue);
					}	
		if(choice==11){
			currencyvalue=amount*0.4286;
			System.out.println("The currency value is: "+currencyvalue);
								}
		else if(choice==12){
			currencyvalue=amount*1.332;
			System.out.println("The currency value is: "+currencyvalue);
					}	
		if(choice==13){
			currencyvalue=amount*2.226;
			System.out.println("The currency value is: "+currencyvalue);
								}
		else if(choice==14){
			currencyvalue=amount*2.341;
			System.out.println("The currency value is: "+currencyvalue);
					}
	}

}
