package com.org.Practice1;


//Happy number program

public class HappyNumber {
		
	public static int isHappyNumber(int n) {
		int sum = 0, last = 0;
		
		while(n>0) {
			last = n%10;
			sum+=last*last;
			n/=10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int n = 30;
		
		while(n != 1 && n != 4) {
			 n = isHappyNumber(n);
		}
		
		if(n == 1)
			System.out.println("it is a happy number");
		else
			System.out.println("it is not a happy number");
	}
}
