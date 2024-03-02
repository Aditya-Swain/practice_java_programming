package com.org.demo;

public class Demo {
		
	public static void main(String[] args) {
		int start = 2;
		int end = 100;
		
		
		for(int i=end;i>=start;i--) {
			int count = 0;
			for(int j=2;j<i;j++) {
				if(i%j == 0) {
					count++;
				     break;
				}
			}
			
			if(count == 0) {
				System.out.println(i);
				break;
			}
		
	}
}
}
