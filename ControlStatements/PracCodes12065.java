package com.hemanth;

import java.util.Scanner;

public class PracCodes12065 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int base;
    System.out.println("Enter the base no: ");
    base = sc.nextInt();
    int power;
    System.out.println("Enter the power no: ");
    power = sc.nextInt();
    int result=1;
    for (int i=1; i<=power; i++) {
    	result *=base;
    }
    System.out.println("Result:"+ result);
}
}
