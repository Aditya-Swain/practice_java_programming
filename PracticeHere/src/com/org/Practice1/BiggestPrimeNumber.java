package com.org.Practice1;

//biggest prime number within range
public class BiggestPrimeNumber {
		public static void main(String[] args) {
			
		int start = 2;
		int end = 100;
		
		for(int i=end;i>=start;i--) {
			boolean flag = true;
			
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(i);
				break;
			}
		}
		
		}
}
