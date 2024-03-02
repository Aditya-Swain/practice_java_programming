package com.org.string1;
	//Longest Palindrome Substring
public class LongestPalindromeSubstring {
		
	public static void main(String[] args) {
		System.out.println(longestPalindromeSubstring("cababae"));
	}
	
	public static String longestPalindromeSubstring(String s) {
		String result = "";
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				String substring = s.substring(i, j);
				if(isPalindrome(substring) && result.length()<substring.length()) {
					result = substring;
				}
			}
		}
		return result;
	}
	
	public static boolean isPalindrome(String s) {
		String reverse = "";
		for(int i=s.length()-1;i>=0;i--) 
			reverse +=s.charAt(i);
		if(s.equals(reverse))
			return true;
		return false;
	}
}
