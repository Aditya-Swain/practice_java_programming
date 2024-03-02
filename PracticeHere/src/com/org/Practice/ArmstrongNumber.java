package com.org.Practice;


public class ArmstrongNumber {
		
	public static void main(String[] args) {
		
		System.out.println(isNeon(1));
			
	}
	
	public static boolean isNeon(int n) {
		int square = n*n;
		int sum = 0;
		int copy = n;
		while(square != 0) {
			sum+=(square%10);
			square/=10;
		}
		if(copy == sum)
			return true;
		return false;
		
	}
}
