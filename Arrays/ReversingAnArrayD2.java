package com.arrays;

import java.util.Scanner;

public class ReversingAnArrayD2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the Array: ");
       int size= sc.nextInt();
       int[] arr= new int[size];
      
       for(int i=0; i<size; i++) {
    	   arr[i]=sc.nextInt();
       }
       System.out.println("Array before reversing: ");
       for (int i=0; i<size; i++) {
    	   System.out.print(arr[i]+" ");
       }
       System.out.println();
       int temp=0;
       for(int i=0; i<size; i++) {
    	   temp=arr[i];
    	   arr[i]=arr[size-1-i];
    	   arr[size-1-i]=temp;
       }
       System.out.println("Array after reversing: ");
       for (int i=0; i<size; i++) {
    	   System.out.print(arr[i]+" ");
       }
	}

}
