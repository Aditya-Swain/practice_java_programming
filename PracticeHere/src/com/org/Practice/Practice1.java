package com.org.Practice;

public class Practice1 {
	
	public static void main(String[] args) {
	System.out.println(sub("repaper"));	
		
		
	}
	
	public static String sub(String s) {
		String demo="";
		for(int i=0;i<=s.length();i++) {
			String temp = "";
			for(int j=i+2;i<=s.length();j++) {
				
				temp=s.substring(i,j);
				if(isPalindrome(temp)) {
					if(demo.length()<temp.length())
						demo=temp;
				}
						
			}
		}
		return demo;
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
