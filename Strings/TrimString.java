package com.strings;

import java.util.Scanner;

public class TrimString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String: ");
		String s1= sc.next();
		
		String trim=s1.trim();
		System.out.println(trim);
	}
}
