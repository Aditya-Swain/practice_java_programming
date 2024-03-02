package com.org.array;

import java.util.Arrays;
//remove duplicate elements from an array


public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] arr = {1,4,3,8,1,11,4,5,9,3,11,17};
		System.out.println(Arrays.toString(arr));
		int[] newArr = removeDuplicate(arr);
		
		for(int n : newArr) {
			if(n != 0)
				System.out.print(" "+n);
		}
		
	}
			
	public static int[] removeDuplicate(int[] arr) {
	
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				continue;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j])
					arr[j] = 0;
			}
		}
		return arr;
		
		
	}
}
