package com.org.array;

public class LargestElement {
	
	//largest element in an array
	
	public static void main(String[] args) {
		int[] arr = {8,5,7,17,1,4,27,21};
		int largeNum = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(largeNum<arr[i])
				largeNum = arr[i];
		}
		System.out.println(largeNum);
	}
}
