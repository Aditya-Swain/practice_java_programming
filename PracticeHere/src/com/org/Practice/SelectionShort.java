package com.org.Practice;

import java.util.Arrays;

public class SelectionShort {

	public static void main(String[] args) {
			int[] arr = {7,3,9,6,4,2,0,5,1};
			System.out.println(Arrays.toString(arr));
			m(arr);
			System.out.println(Arrays.toString(arr));
	}
	public static void m(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min])
					min = j;
			}
			if(i!= min) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}

}
