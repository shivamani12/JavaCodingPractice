package com.KS.Array4;

import java.util.Arrays;

public class SquareSortedArrPositiveNegative {
public static void main(String[] args) {
	
	
	// Square Soreted Array of +ve -ve
	
	int arr[]= {8,-1,2,4,5,7};
	
	int s=0;
	int e=arr.length-1;
	
	int squarArr[]=new int[arr.length];
	int index=arr.length-1;
	
	while(s<=e) {
		

		if(squarArr[s]*squarArr[s]>squarArr[e]*squarArr[e]) {			
			squarArr[index--]=arr[s]*arr[s];
//			System.out.println(Arrays.toString(squarArr));
			s++;
		}else {
			squarArr[index--]=arr[e]*arr[e];
//			System.out.println(Arrays.toString(squarArr));
			
			e--;
		}
		
	}
	System.out.println(Arrays.toString(squarArr));
	for(int a:squarArr) {
		System.out.println(a);
	}
}
}
