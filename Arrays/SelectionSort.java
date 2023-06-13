package com.arrays;
import java.util.Scanner;

public class SelectionSort {

	static void sort(int[] arr) {
		int len=arr.length;
		for(int i=0; i<len-1; i++) {
			int min_in=i;
			for (int j=i+1; j<len; j++) {
				if(arr[j]<arr[min_in]) {
					min_in=j;
				}
			}
		int temp=arr[min_in];
		arr[min_in]=arr[i];
		arr[i]=temp;
		}
	}

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		int[] arr= new int[size];
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		SelectionSort.sort(arr);
		for (int elm: arr) {
			System.out.print(elm+", ");
		}
		
		
	}
}
