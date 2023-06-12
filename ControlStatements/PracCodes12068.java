package com.hemanth;

import java.util.Scanner;

public class PracCodes12068 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		boolean flag=true;
		System.out.println("Enter the Number: ");
		number= sc.nextInt();
		
		for (int i=2; i<number;i++) {
			if (number%i==0) {
				flag=false;
				break;
			}
		}
		if(flag && number>1) {
			System.out.println("Enterd number is prime");
		}
		else {
			System.out.println("Enterd number is not prime");
		}
		}
		
	}
