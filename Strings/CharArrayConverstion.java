package com.strings;

import java.util.Scanner;

public class CharArrayConverstion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String: ");
		String s1= sc.next();
		
		char[] charArray=s1.toCharArray();
		
		for(char c:charArray) {
			System.out.println(c);
		}
	}
}
