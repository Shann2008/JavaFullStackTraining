package com.arrays;

import java.util.Scanner;

public class BubbleSort {
static void sort(int[] arr) {
	int len=arr.length;
	
	for (int i=0; i<len-1; i++) {
		for(int j=0; j<len-i-1; j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
		}
	}
}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		BubbleSort.sort(arr);
		for(int elm : arr) {
			System.out.print(elm+", ");
		}
	}
}
