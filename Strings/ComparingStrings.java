package com.strings;

import java.util.Scanner;

public class ComparingStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter s1");
		String s1=sc.next();
		System.out.println("Enter s2");
		String s2=sc.next();
		
		if(s1.equals(s2)) {
			System.out.println("Content is same");
		}
		else{
			System.out.println("content is not same");
		}
	}

}
