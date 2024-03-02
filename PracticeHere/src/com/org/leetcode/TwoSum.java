package com.org.leetcode;

import java.util.Arrays;

public class TwoSum {
			
	public int[] toSum(int[] arr , int target) {
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {2,7,11,15,4};
		TwoSum sum = new TwoSum();
		System.out.println(Arrays.toString(sum.toSum(arr,9)));
		
	}
}
