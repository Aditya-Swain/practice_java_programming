package com.org.leetcode;

public class PalindromeNumber {
		
	public boolean isPalindrome(int x) {
		int  copy = x;
		int temp = 0;
		
		if(x<0)
			return false;
		
		while(x != 0) {
			temp = (temp*10)+(x%10);
			x/=10;
		}
		
		if(temp == copy)
			return true;
		return false;
		
	}
	public static void main(String[] args) {
		PalindromeNumber p = new PalindromeNumber();
		
		System.out.println(p.isPalindrome(-121));
	}
}
