package com.org.demo;

	//max and min element in an array

public class Demo1 {
			
	public static void main(String[] args) {
		int[] arr = {2,8,6,9,3,10,19,16,11};
		method(arr);
	}
	
	public static void method(int[] arr) {
		int max = 0;
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
				max = arr[i];
			
			if(min>arr[i])
				min = arr[i];
		}
		System.out.println("max value : "+max);
		System.out.println("min value : "+min);
	}
}
