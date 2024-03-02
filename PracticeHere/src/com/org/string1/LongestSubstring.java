package com.org.string1;
//longest substring without repeating character
public class LongestSubstring {
			
	public static void main(String[] args) {
		String s = "kakashi";
		String longsub="";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				String substring = s.substring(i, j);
				boolean result = checkRepeat(substring);
				if(result == true && longsub.length()<substring.length()) {
					longsub = substring;
				}
				
			}
		}
		System.out.println(longsub);
	}
	
	public static boolean checkRepeat(String s) {
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i) == s.charAt(j))
					return false;
			}
		}
		return true;
	}
}
