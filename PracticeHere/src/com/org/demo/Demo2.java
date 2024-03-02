package com.org.demo;

public class Demo2 {
			
	public static void main(String[] args) {
		int[] arr = {16,8,6,9,3,10,19,11,2};
		method(arr);
	}

	private static void method(int[] arr) {
			
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			
		}
		for(int n:arr) {
			System.out.print(n+" ");
		}
		
	}
}
