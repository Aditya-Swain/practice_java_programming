package com.org.Practice;

public class BubbleShort {
			public static void main(String[] args) {
				int[] arr = {8,5,0,2,7,9,1,0,2};
				for(int a:arr)
					System.out.print(" "+a);
				m(arr);
				System.out.println();
				for(int a:arr)
					System.out.print(" " +a);
			}
			
			public static void m(int[] arr) {
				for(int i=0;i<arr.length-1;i++) {
					for(int j=0;j<arr.length-1;j++) {
						if(arr[j]>arr[j+1]) {
							int temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1] = temp;
								
						}
					}
				}
			}
}
