package com.hemanth;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive number");
		int number = input.nextInt();
		boolean isPrime = true;
		if(number==0||number==1){
			isPrime=false;
		}
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				isPrime=false;
				break;
			}
			}
		if(isPrime) {
			System.out.println(number+" Is a prime number.");
		}
		else {
			System.out.println(number+" Is not a prime number.");
		}
		}
	}
