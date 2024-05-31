package com.KS.Array4;

import java.util.Arrays;

public class MoveAllZero {
public static void main(String[] args) {
	
	
	
//	for(int i=0; i<arr.length; i++) {
//		if(arr[i]==0) {
//			newArr[j++]=arr[i];
//		}
//	}
//	
//	System.out.println(Arrays.toString(newArr));
	
	int arr[]= {1,2,0,4,2,0,7};
	int left=0;
	int right=arr.length-1;
	
	while(left<right){
		
			while(arr[left]!=0){
				left++;
			}
			while(arr[right]==0){
				right--;	
			}
		
		
		if(left<right){
			
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		
	}
	System.out.println(Arrays.toString(arr));
	
}
}
