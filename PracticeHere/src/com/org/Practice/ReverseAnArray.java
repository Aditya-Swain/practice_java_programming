package com.org.Practice;

public class ReverseAnArray {
		public static void main(String[] args) {
			int[] arr = {12,34,5,9,11,10};
			for(int m : arr) {
				System.out.print(m+" ");
			}
			System.out.println();
			reverse(arr,arr.length);
		}
		
		public static void reverse(int[] arr, int n) {
			int[] newArr = new int[n];
			int j = n;
			for(int i=0;i<arr.length;i++) {
				newArr[j-1] = arr[i];
				j--;
			}
			
			for(int m : newArr) {
				System.out.print(m+" ");
			}
		}
}
