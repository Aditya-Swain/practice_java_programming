package com.org.Practice1;

public class Demo {
			
	public static void main(String[] args) {
	int n = 9;
	int stars=1;
	int spaces=n/2;
	
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=spaces;j++)
			System.out.print(" ");
		
		for(int j=1;j<=stars;j++) {
//			if(j==1)
			System.out.print("*");
//			else
//				System.out.print(" ");
		}
		
		if(i<=n/2) {
			stars+=2;
			spaces--;
		}
		else {
			stars-=2;
			spaces++;
		}
		System.out.println();
	}
		
		
	
	}
	

}
