package com.org.array;

public class SecondSmallest {
		
	public static void main(String[] args) {
		int[] arr = {14,6,3,12,5,9,7,12,10,};
		System.out.println(secondSmallest(arr));
	}
	
	public static int secondSmallest(int[] arr) { 
		int first = arr[0];
		int second = 0;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < first) {
				 second = first;
				 first = arr[i];
			}
			else if(arr[i] < second  &&  arr[i] != first)
				second = arr[i];
		}
		return second;
	}
}
