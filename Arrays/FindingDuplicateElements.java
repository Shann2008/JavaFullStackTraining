package com.arrays;

import java.util.Scanner;

public class FindingDuplicateElements {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the arr:");
	int size= sc.nextInt();
	int[] arr= new int[size];
	
	for (int i=0; i<arr.length; i++) {
		System.out.println("Enter elemnt no("+(i+1)+")");
		arr[i]=sc.nextInt();
	}
	System.out.println();
	
	System.out.print("Given Array: ");
	for (int i=0; i<arr.length; i++) {
		
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	
	for(int i=0; i<arr.length-1; i++){
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]== arr[j]) {
				System.out.println(arr[i]+" and "+arr[j]+" are duplicate elements");
			}
		}
	}
}
}
