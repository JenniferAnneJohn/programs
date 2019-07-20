package com.redington.exercise;

import java.util.Scanner;

public class JoinWordsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("******* CONCATENATION OF STRINGS *******");
		System.out.println("Enter word 1: ");
		String word1=scan.next();
		System.out.println("Enter word 2: ");
		String word2=scan.next();
		
		JoinWords wo=new JoinWords();
		wo.cool(word1,word2);
		System.out.println("OUTPUT:"+wo.cool(word1,word2));
	}

}
