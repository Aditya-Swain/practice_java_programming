package com.org.leetcode;

public class Problem {
		
	public static void main(String[] args) {
		int[] nums = {78,0,-90,7,12,345,2,6,7896};
			
		Problem p = new Problem();
		System.out.println(p.findNumbers(nums));
		
	
		
	}
	
	
	
	//using for loop
	
	public static int count(int[] arr) {
		int numCount = 0;
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			while(arr[i] != 0) {
				arr[i]/=10;
				count++;
			}
			if(count%2==0)
				numCount++;
			
			
		}
		return numCount;
	}
	
	//using for each loop
	
	public static int count1(int[] nums) {// {78,7,12,345,2,6,7896,909867,7654345,90895643};
		int numCount = 0;
		
		for(int n : nums) {
			if(n==0)
				numCount++;
			
			if(checkEven1(n)%2==0)
				numCount++;
			
		}
		return numCount;
	}
	
	
	public static boolean checkEven(int num) {
		int count = 0;
		while(num != 0) {
			count++;
			num/=10;
		}
		return count % 2 == 0;
	}
	
	static int checkEven1(int num) {
		if(num < 0)
			num*=-1;
		
		return (int)Math.log10(num)+1;
	}
	
	 public int findNumbers(int[] nums) {
	        int count = 0;
	        for(int n:nums){
	        	
	        	if(n == 0)
	        		count++;
	              if(digits(n)%2 == 0)
	              count++;     
	        }
	        return count;
	    }

	    public  int digits(int num){
	        if(num < 0)
	            num*=-1;
	        return (int)Math.log10(num)+1;    
	        
	    }
	
	
}
