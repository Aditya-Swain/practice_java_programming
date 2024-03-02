package com.org.array;

import java.util.Scanner;

public class LinearSearch {
			
	public static void main(String[] args) {
		Scanner os = new Scanner(System.in);
		int[] x = {7,9,11,14,17,21,5,2,23,37};
		boolean flag = true;
		
		System.out.println("enter the key value : ");
		int key = os.nextInt();
		
		for(int i=0;i<x.length;i++) {
			
			if(key == x[i]) {
				flag = false;
				System.out.println(x[i] + " found at index "+i);
				break;
			}
		}
		if(flag)
			System.out.println(key+" not found");
		
		
	}
}
