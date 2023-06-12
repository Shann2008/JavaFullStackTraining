package com.hemanth;
import java.util.Scanner;
public class PracCodes12066 {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int number;
	char choice;
	int evenSum=0;
	int oddSum=0;		
	
	do {
		System.out.println("Enter the number: ");
		number = sc.nextInt();
		if (number % 2 == 0){
			evenSum +=number;
		}
		else {
			oddSum +=number;
		}
		System.out.println("If you want to continue press 'y' if not press any key: ");
		choice = sc.next().charAt(0);	
	} while (choice=='y' || choice=='Y');
	
	System.out.println("Sum of Even Numbers= "+evenSum);
	System.out.println("Sum of Odd Numbers: "+ oddSum);
}
}
