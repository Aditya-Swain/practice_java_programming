package com.org.Practice1;

import java.util.Arrays;

public class Demo2 {
			
	public static void main(String[] args) {
		
		int[] arr = {5,3,8,6,5,2,1,4};
		
		System.out.println(Arrays.toString(bubbleShort(arr)));
	}
	
	public static int[] bubbleShort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int copy = arr[j];
					arr[j] = arr[i];
					arr[i]=copy;
				}
			}
		}
		return arr;
	}
}
