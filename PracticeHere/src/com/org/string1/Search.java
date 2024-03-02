package com.org.string1;

import java.util.Arrays;

public class Search {
			
	public static void main(String[] args) {
		String s = "prabhat swain";
		int answer = findIndex(s, 'z',3,9);
		System.out.println(answer);
		System.out.println(Arrays.toString(s.toCharArray()));
	}
	
	public static int findIndex(String s , char ch,int st ,int end) {
		if(s.length()==0)
			return -1;
		
		for(int index=st;index<end;index++) {
			if(s.charAt(index)==ch)
				return index;
		}
		return -1;
	}
	
	public static boolean findIndex1(String s , char ch) {
		if(s.length()==0)
			return false;
		
		for(char c : s.toCharArray())
		{
			if(c == ch)
				return true;
		}
		return false;
					
	}
}
