package com.arrays;

import java.util.Scanner;

public class SumOfMatchingArraysD3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int size=sc.nextInt();
		int[] arr= new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter element no("+(i+1)+"): ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Given Array:");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
     int sum = 8;
     for (int i=0; i<arr.length; i++) {
    	 for(int j=i+1; j<arr.length; j++) {
    	 if(arr[i]+arr[j]==sum) {
    		 System.out.println(arr[i]+"+"+arr[j]+"="+sum);
    	 }
    	 }
     }
	}
}
