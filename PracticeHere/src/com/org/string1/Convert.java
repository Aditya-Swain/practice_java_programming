package com.org.string1;
//convert from lower case to upper case
public class Convert {
	public static void main(String[] args) {
		String s = "ItaDoRi";
		String temp = "";
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z') {
				ch = (char)(ch-32);
				temp+=ch;
			}
			else
				temp+=ch;
		}
		System.out.println(temp);
	}
}
