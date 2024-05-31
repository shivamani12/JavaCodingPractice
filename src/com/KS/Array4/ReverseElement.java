package com.KS.Array4;

import java.util.Arrays;

public class ReverseElement {
public static void main(String[] args) {
	
	
	int arr[]= {1,2,3,4,5};
	
//	int start=0;
//	int end=arr.length-1;
//	
//	while(start<end) {
//		
//		int temp=arr[start];
//		arr[start]=arr[end];
//		arr[end]=temp;
//		
//		start++;
//		end--;
//		
//	}
//	System.out.println(Arrays.toString(arr));
//	
	
//	int start=0;
//	int end=arr.length-1;
//	
	int end=arr.length-1;
	for(int i=0; i<end; i++) {
		int temp=arr[i];
		arr[i]=arr[end];
		arr[end]=temp;
		end--;	
	}
	System.out.println(Arrays.toString(arr));
	
	
}
}
