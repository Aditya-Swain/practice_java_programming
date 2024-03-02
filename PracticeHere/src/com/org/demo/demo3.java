package com.org.demo;

public class demo3 {
		public static void main(String[] args) {
			int[] arr = {1,5,6,7,8,10,19,11,2};
			System.out.println(peak(arr)); 
		}
		
		
		public static int peak(int[] arr) {
			for(int i=0;i<arr.length;i++) {
				
				if(i==0 && arr[i]>arr[i+1])
					return 0;
				if(i==arr.length-1 && arr[i]>arr[i-1]) return i;
				if(i!=0 && arr[i]>arr[i-1] && arr[i]>arr[i+1])
					return i;
			}
			return -1;
		}
}
