package com.hemanth;

import java.util.Scanner;

public class GuessMyNumberGame {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int myNumber=(int)(Math.random()*100);
	int userNumber=0;
	do {
		System.out.println("Guess My Number: ");
		userNumber=sc.nextInt();
		if (userNumber==myNumber){
			System.out.println("You got the number");
			break;
		}
		else if(userNumber<myNumber) {
			System.out.println("Your given number is low");
		}
		else if(userNumber>myNumber) {
			System.out.println("Your given number is high");
		}
	}while(userNumber>=0);
	System.out.println("My number was"+ myNumber);
}
}
