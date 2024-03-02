package com.org.array;

public class MinNum {
		
	public static void main(String[] args) {
		int[] arr = {23,45,67,87,30,29,20,17};
		System.out.println(minElement(arr));
	}
	public static int minElement(int[] arr) {
		int minNum = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<minNum)
				minNum = arr[i];
		}
		return minNum;
	}
}
