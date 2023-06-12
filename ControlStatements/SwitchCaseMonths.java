package com.hemanth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchCaseMonths {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter Month Number: ");
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String result = br.readLine();
		int month=Integer.parseInt(result);
		
		switch(month) {
		case 10:
			System.out.println("January");
			break;
		case 11:
			System.out.println("February");
			break;
		case 12:
			System.out.println("March");
			break;
		case 13:
			System.out.println("April");
			break;
		case 14:
			System.out.println("May");
			break;
		case 15:
			System.out.println("June");
			break;
		case 16:
			System.out.println("July");
			break;
		case 17:
			System.out.println("August");
			break;
		case 18:
			System.out.println("September");
			break;
		case 19:
			System.out.println("October");
			break;
		case 20:
			System.out.println("November");
			break;
		case 21:
			System.out.println("December");
			break;
		default:
			System.out.println("No month found");
			
		}
		
		
	}
}
