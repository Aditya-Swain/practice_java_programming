package com.org.demo;

public class Demo4 {
	    public int findPeakElement(int[] nums) {
	        int n=nums.length;
	        int[] arr;
	        if(n==1){
	            return 0;
	        }
	        else if (nums[0]>nums[1]){
	            return 0;
	        }
	        else if(nums[n-1]>nums[n-2])
	        {
	            return n-1;
	        }
	        else
	        {
	            for(int i=1;i<n-1;i++){
	                if(nums[i-1]<=nums[i] && nums[i]>=nums[i+1]){
	                    return i;
	                }
	            }
	        }
	        return -1;
	    }
	    
	    public static void main(String[] args) {
	    	int[] arr = {1,5,6,7,8,10,19,11,2};
			Demo4 demo = new Demo4();
			System.out.println(demo.findPeakElement(arr));
		}
	}

