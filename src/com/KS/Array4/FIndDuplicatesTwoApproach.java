package com.KS.Array4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FIndDuplicatesTwoApproach {
public static void main(String[] args) {
	
	int []arr=new int [] {1,2,2,3,4,3,5};
	
	// brute force
	
	for(int i=0; i<arr.length; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]==arr[j]) {
				System.out.println(arr[i]);
			}
			
		}
	}
	
	
	// using extra memory
	
	Set<Integer> set=new HashSet<Integer>();

	for(int i=0; i<arr.length; i++) {
		if(set.contains(arr[i])) {
			System.out.println(arr[i]);
		}else {
			set.add(arr[i]);
		}
	}
	
	
}
}
