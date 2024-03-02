package com.org.array;

import java.util.Scanner;

public class Sample {
			public static void main(String[] args) {
				Scanner os = new Scanner(System.in);
				System.out.println("Enter the size of array");
				int size = os.nextInt();
				
				int[] arr = new int[size];
				System.out.println("Enter the elements to store");
								
				for(int i=0;i<arr.length;i++) {
					arr[i] = os.nextInt();
				}
				
				
				System.out.println("printing the values");
				
				for(int x : arr)
					System.out.print(x+" ");
			}
}
