package com.strings;

import java.util.Scanner;

public class StringStartEnd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
System.out.print("Enter string: ");
	String s1=sc.next()
			;
	System.out.println();
	
	System.out.println("String starting with");
	if (s1.startsWith(sc.next())){
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
}
}
