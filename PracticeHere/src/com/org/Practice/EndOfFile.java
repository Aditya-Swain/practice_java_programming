package com.org.Practice;

import java.util.Scanner;

public class EndOfFile {
		public static void main(String[] args) {
			Scanner os = new Scanner(System.in);
			int n = 1;
			while(os.hasNext())
				System.out.println(n++ +" "+ os.nextLine());
		}
}
