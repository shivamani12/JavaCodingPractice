package com.KS.LeetCode;

import java.util.Arrays;

public class RemoveElementFromSortedArrays02 {
public static void main(String[] args) {
	
	
	
//	nput: nums = [1,1,2]
	
	int nums[]=new int[] {1,1,2};
	int count=0;
	for(int i=0; i<nums.length-1; i++) {
		
		if(nums[i]!=nums[i+1]) {
			nums[count++]=nums[i];
		}
		
	}
	nums[count++]=nums[nums.length-1];
	System.out.println(Arrays.toString(nums));
			
	
}
}
