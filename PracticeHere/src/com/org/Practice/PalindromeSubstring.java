package com.org.Practice;

public class PalindromeSubstring {
		
	public static void main(String[] args) {
		
		String s = "malayalam";
		
		String demo = "";
		
		for(int i=0 ;i<s.length();i++) {
			
			for(int j=i+2;j<s.length();j++) {
				String temp = s.substring(i, j);
				
				if(isPalindrome(temp)) {
					if(demo.length()<temp.length())
						demo=temp;
				}
			}
		}
		System.out.println(demo);
	}
	
	public static boolean isPalindrome(String s) {
		
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		if(rev.equals(s))
		return true;
		return false;
				
	}
	
	
	
	
}
