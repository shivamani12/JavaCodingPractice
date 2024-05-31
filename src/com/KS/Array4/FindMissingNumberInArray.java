package com.KS.Array4;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingNumberInArray {
public static void main(String[] args) {
	
	
	int arr[]= {2,3,4,1,6,7,9,8};
	
	findMissing(arr);

}

public static void findMissing(int arr[]) {
//=================================================================================================================================================
		
//		// expected length
//	int n=arr.length+1;
//	
//		//expected sum
//	int expectedSum=n*(n+1)/2;
//	
//	// calculate actual sum
//		int actualsum=0;
//	for(int num:arr) {
//			actualsum=actualsum+num;
//	}
//	
//	//  find the missing number
//	int MissingNumber=expectedSum-actualsum;
//	System.out.println(MissingNumber);

	//=================================================================================================================================================
	// using hashset
	
	HashSet<Integer> set=new HashSet();
	
	//actual values;
	for(int num:arr) {
		set.add(num);
	}
	int expectedLength=arr.length+1;
	for(int i=1; i<=expectedLength; i++) {
		
		if(!set.contains(i)) {
			System.out.println(i);
		}	
	}

	
	
}
}
		
	
