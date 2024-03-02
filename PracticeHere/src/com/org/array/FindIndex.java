package com.org.array;

//find index of an element

public class FindIndex {
		
	public static void main(String[] args) {
		int[] arr = {14,6,3,12,5,9,7,12,10,19};
		System.out.println(ind(arr,29));
	}
	
	public static int ind(int[] arr ,int element) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == element)
				return i;
			
		}
		 return -1;
	}
}
