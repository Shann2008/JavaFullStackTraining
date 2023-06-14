package com.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class MinElementMaxElementD2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of the Array");
	int size=sc.nextInt();
	
	int[] marks=new int[size];
	
	for (int i=0; i<size; i++) {
		marks[i]=sc.nextInt();	
		}
	System.out.println("Before Sorting:");
	for(int i=0; i<size; i++) {
		System.out.print(marks[i]+" ");
	}
	System.out.println();
	
	Arrays.sort(marks);
	
	System.out.println("After Sorting:");
	for(int i=0; i<size; i++) {
		System.out.print(marks[i]+" ");
	}
	System.out.println();
	
	System.out.println("Min_Element="+marks[0]);
	System.out.println("Max_Element="+marks[size-1]);
}
	
}
