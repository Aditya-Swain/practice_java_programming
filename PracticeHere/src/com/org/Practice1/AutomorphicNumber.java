package com.org.Practice1;

public class AutomorphicNumber {
		
	
	// method --1
	public static boolean isAutomorphicNumber(int n) {
			int sq = n*n;
			while(n!=0) {
				
				if(n%10 == sq%10) {
					n/=10;
					sq/=10;
				}
				else return false;
			}
		return true;
	}
	
	//method -- 2
	
	public static boolean isAutomorphicNumber1(int n) {
		int copy = n;
		int sq = n*n;
		int demo = 1;
		
		while(n != 0) {
			n/=10;
			demo*=10;
		}
		if((sq%demo) == copy)
			return true;
		else 
			return false;
	}

	
	public static void main(String[] args) {
		System.out.println(isAutomorphicNumber1(25));
	}
}
