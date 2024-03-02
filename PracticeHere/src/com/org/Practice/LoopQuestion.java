package com.org.Practice;

import java.util.Scanner;

public class LoopQuestion {
	public static void main(String[] args) {
		System.out.println("Enter value of t : ");
		Scanner os = new Scanner(System.in);
		int t=os.nextInt();
		for(int i=0;i<t;i++) {
			int a = os.nextInt();
			int b = os.nextInt();
			int n = os.nextInt();
			
			for(int j=0;j<n;j++) {
				a+= (int) (Math.pow(2, j)*b);
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
}
