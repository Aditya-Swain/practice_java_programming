package com.org.demo;

//convert all characters to capital letter
public class Demo5 {
		public static void main(String[] args) {
			
			String s = "AdiTYa";
			String temp = "";
			for(int i=0;i<s.length();i++) {
				char ch = s.charAt(i);
				if(ch >=97 && ch<=122) {
					ch = (char)(ch-32);
					temp+=ch;
				}
				else
					temp+=ch;
			}
			System.out.println(temp);
			
			
		}
}
