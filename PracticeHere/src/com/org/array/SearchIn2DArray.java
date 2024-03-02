package com.org.array;



public class SearchIn2DArray {
		public static void main(String[] args) {
			int[][] arr = {
					{2,9,4,3,7},
					{12,78,32,9},
					{8,3,1,13,90},
					{23,65,34,11},
					};
			
			
			System.out.println((search(arr)));
		}
		
		public static int search(int[][] arr) {
			int minValue = Integer.MAX_VALUE;
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					if(minValue > arr[i][j])
						minValue = arr[i][j];
				}
			}
			return minValue;
		}
		
		
}
