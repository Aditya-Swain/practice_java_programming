package com.org.leetcode;

public class RichestCustomerWealth {
		
	public static void main(String[] args) {
			
		int[][] accounts = {{2,7},{7,1,3},{9,5}};
		System.out.println(richest(accounts));
		System.out.println(rich(accounts));
	}
	
	// using for loop
	
	public static int richest(int[][] accounts) {
		int wealth = 0;
		
		for(int customer =0;customer<accounts.length;customer++) {
			int individualWealth = 0;
			for(int bank =0;bank<accounts[customer].length;bank++) {
				individualWealth += accounts[customer][bank];
			}
			if(wealth < individualWealth)
				wealth = individualWealth;
		}
		return wealth;
	}
	
	
	//using for each loop
	
	public static int rich(int[][] accounts) {
		int maxWealth = 0;
		
		for(int[] customer : accounts) {
			int wealth = 0;
			for(int account : customer) {
				wealth+=account;
			}
			if(wealth > maxWealth)
				maxWealth = wealth;
		}
		return maxWealth;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
