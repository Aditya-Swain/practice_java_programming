package com.org.string1;

public class CountChar {
		public static void main(String[] args) {
			String s = "adi#@49";
			int charCount = 0;
			int numCount = 0;
			int specialCount  = 0;
			
			for(int i=0;i<s.length();i++) {
				char ch = s.charAt(i);
				
				if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
					charCount++;
				else if(ch>='0' && ch<='9')
					numCount++;
				else
					specialCount++;
			}
			
			System.out.println("total character count : "+charCount);
			System.out.println("total number count : "+numCount);
			System.out.println("total special character count : "+specialCount);
		}
}
