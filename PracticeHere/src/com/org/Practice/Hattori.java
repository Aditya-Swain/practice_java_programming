package com.org.Practice;

public class Hattori {
	
	public String longestPalindrome(String s) {
			String demo="";
		for(int i=0;i<=s.length();i++) {
			
			for(int j=i+2;j<s.length();j++) {
				String temp=s.substring(i, j);
				
				if(reverse(temp)) {
					if(demo.length()<temp.length())
						demo=temp;
				}
					
			}
		}
		
		return demo;
	}
	public static boolean reverse(String s) {
		String rev = "";
		for(int j=s.length()-1;j>=0;j--) {
			rev+=s.charAt(j);
		}
		if(rev.equals(s))
		return true;
		return false;
	}
	
	public static void main(String[] args) {
		Hattori hattori = new Hattori();
		System.out.println(hattori.longestPalindrome("a"));
	}
}	

