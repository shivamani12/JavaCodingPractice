package com.KS.LeetCode;

public class searchInsert35 {

	public static void main(String[] args) {
		
		
		 int nums []= {1,3,5,6}; 
		 int tgt = 5;
				 
		 
		 int start=0;
		 int end=nums.length-1;
		 
		 
		 while(start <= end) {
			
			 int mid = start + (end-start)/2;
			 
			 	if(nums[mid]==tgt) 
			 			System.out.println(mid);
			 	
			 	else if(tgt<nums[mid]) 
			 		end=mid-1;
			 	else 
			 		start= mid+1;
			 	
		 	}
		 
		 System.out.println(start);
	}
}
	
