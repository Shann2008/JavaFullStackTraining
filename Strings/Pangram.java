package com.strings;

import java.util.Scanner;  

public class Pangram {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
	System.out.print("Enter the string: ");
	String s= sc.nextLine();
	int n=s.length();
	int freq[]=new int[26];
	for (int i=0; i<26; i++) {
		freq[i]=0;
	}
	for (int i=0; i<n; i++) {
		if(s.charAt(i)!=' ') {
			freq[s.charAt(i)-'a']++;
		}
	}
	int temp=0;
	for (int i=0; i<26; i++) {
		if(freq[i]==0) {
			temp=1;
			break;
		}
	}
	if(temp==1) {
		System.out.println("Given string is not pangram");
		
	}
		else {
			System.out.println("Given string is pangram");
		}
	}
	}
	