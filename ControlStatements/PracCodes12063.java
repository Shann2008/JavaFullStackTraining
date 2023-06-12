package com.hemanth;

import java.util.Scanner;

public class PracCodes12063 {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    System.out.println("Multiplication table of: "+num);
	    
	    int i=1;
	    		for (i=1; i<=10; i++) {
	    			System.out.println(num+" x "+i+" = "+(num*i));
	    		}
	}
}
