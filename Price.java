package com.redington.exercise;

import java.util.Scanner;
public class Price {
	float productPrice;
	float discountRate;
	float discountAmount;
	float salePrice;
	void display()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("$$$$$$$$$$ PRICE OF A PRODUCT $$$$$$$$$$");
		System.out.println("Enter Product price:");
		productPrice=scan.nextFloat();
		System.out.println("Enter rate of discount:");
		discountRate=scan.nextFloat();
		
		discountAmount=productPrice*(discountRate/100);
		System.out.println("The discount amount is: "+discountAmount);
		salePrice=productPrice-discountAmount;
		System.out.println("The final price is :" +salePrice);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Price p=new Price();
		p.display();

	}

}
