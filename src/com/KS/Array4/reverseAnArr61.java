package com.KS.Array4;

import java.util.Arrays;

public class reverseAnArr61 {
public static void main(String[] args) {
	

	int a[]= {10,20,30,40};
	
	int left=0;
	int right=a.length-1;
	
	while(left<right) {
		
		int temp=a[left];
		a[left]=a[right];
		a[right]=temp;
		left++;
		right--;
	}
	
	System.out.println(Arrays.toString(a));
}
}
