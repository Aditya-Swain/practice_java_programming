package com.org.Practice1;

public class XylemNumber {
		
	public static void main(String[] args) {
		int n = 42328;
		int sum1 = n%10;
		int sum2 = 0;
		
		n/=10;
		
		while(n>9) {
			sum2+=(n%10);
			n/=10;
		}
		sum1+=n;
		if(sum1 == sum2)
			System.out.println("it is a xylem number");
		else
			System.out.println("it is not a xylem number");
	}
}
