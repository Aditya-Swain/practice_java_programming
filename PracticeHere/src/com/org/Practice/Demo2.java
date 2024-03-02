package com.org.Practice;

public class Demo2 {
		
	public static void main(String[] args) {
		fact(0); 
	}
	
	public static void fact(int n) {
		
		if(n<10)
		{
			++n;
			n++;
			fact(n);
			System.out.println(n);
		}
		
	}
}
