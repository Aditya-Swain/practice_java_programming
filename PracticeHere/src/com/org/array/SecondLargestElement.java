package com.org.array;

		//second largest element in an array

public class SecondLargestElement {
			
	public static void main(String[] args) {
		int[] arr = {3,7,9,16,1,8,2,10,6};
		System.out.println(secondLargest(arr));
	}
	
	public static int secondLargest(int[] arr) {
		int first = 0;
		int second = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(first < arr[i]) {
				second = first;
				first = arr[i];
			}
			
			else if(second < arr[i] && arr[i] != first)
				second = arr[i];
		}
		return second;
	}
}
